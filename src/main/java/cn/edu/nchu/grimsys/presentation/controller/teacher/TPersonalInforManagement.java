package cn.edu.nchu.grimsys.presentation.controller.teacher;

import cn.edu.nchu.grimsys.domain.AbstrTeacher;
import cn.edu.nchu.grimsys.domain.impl.vision1.Teacher;
import cn.edu.nchu.grimsys.service.TeacherService;
import cn.edu.nchu.grimsys.util.StringHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * 162015班 第11组
 * 毕设信息管理系统--模块
 * @author ：
 * date：
 * 主要功能说明：
 */
@RequestMapping("/teacher")
@Controller
public class TPersonalInforManagement implements WebMvcConfigurer {
    @Autowired
    private TeacherService teacherService;
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/teacher/teacher-back").setViewName("/teacher/back");
    }



    @RequestMapping(value="/teacher-info-update" ,method=RequestMethod.GET)
    public String giveUser(Model model,HttpSession session){

        AbstrTeacher teacher = (AbstrTeacher) session.getAttribute("teacher");
        model.addAttribute(teacher);
        return "/teacher/info-management/teacher-info-update";
    }


    /**
     * 教师修改个人信息
     * @param teacher
     * @param model
     * @param bindingResult
     * @param session
     * @return
     */
    @PostMapping("/updateTeacher")
    public String updateTeacher(@Validated Teacher teacher,BindingResult bindingResult, Model model, HttpSession session){
        if (bindingResult.hasFieldErrors()){//绑定有错
            System.out.println(bindingResult.getAllErrors());
            model.addAttribute(teacher);
            System.out.println("凉凉！");
            return  "/teacher/info-management/teacher-info-update";
        }else {
            AbstrTeacher teacher1 =(AbstrTeacher)session.getAttribute("teacher");
            teacher1.setTelephone(teacher.getTelephone());
            if (teacherService.updateTeacher(teacher1)) {
                System.out.println("成功！");
                model.addAttribute(teacher);
                session.setAttribute("teacher", teacher1);
                return "redirect:/teacher/teacher-back";//修改成功
            } else {//失败！
                model.addAttribute("errorMsg", "业务繁忙，请稍后重试！");
                return "/teacher/info-management/teacher-info-update";
            }
        }
    }

    /**
     * 修改密码
     * @param model
     * @param session
     * @return
     */

    @PostMapping("/updateTeacherPass")
    public String updateTeacherPass(Model model, HttpSession session, HttpServletRequest request){

           String oldPassword=request.getParameter("password");
           String confirmPassword=request.getParameter("confirmPassword");
           String newPassword =request.getParameter("newPassword");
           AbstrTeacher teacher =(AbstrTeacher)session.getAttribute("teacher");
           String realPassword=teacher.getPassword();
        if(realPassword.equals(StringHelper.encrypt(oldPassword))) {
            if (newPassword.trim().equals(confirmPassword)) {
                if (StringHelper.empty(newPassword)){
                    model.addAttribute("errorMsg","新密码不能为空！");
                    model.addAttribute(teacher);
                    return "/teacher/info-management/teacher-info-update";
                }else{
                    teacher.setPassword(StringHelper.encrypt(newPassword));
                    if (teacherService.updateTeacher(teacher)) {
                        System.out.println("成功！");
                        model.addAttribute(teacher);
                        session.setAttribute("teacher", teacher);
                        return "redirect:/teacher/teacher-back";//修改成功
                    } else {//失败！
                        model.addAttribute(teacher);
                        model.addAttribute("errorMsg", "业务繁忙，请稍后重试！");
                        return "/teacher/info-management/teacher-info-update";
                    }

                }


            }else{
                model.addAttribute(teacher);
                model.addAttribute("errorMsg","两次密码输入不一致！");
                return "/teacher/info-management/teacher-info-update";
            }

        }else{
            model.addAttribute(teacher);

            model.addAttribute("errorMsg","原密码不正确！");
            return "/teacher/info-management/teacher-info-update";
        }

        }

}
