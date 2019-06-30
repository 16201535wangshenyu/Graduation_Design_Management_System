package cn.edu.nchu.grimsys.presentation.controller.student;

import cn.edu.nchu.grimsys.domain.AbstrAdmin;
import cn.edu.nchu.grimsys.domain.AbstrStudent;
import cn.edu.nchu.grimsys.domain.impl.vision1.Admin;
import cn.edu.nchu.grimsys.domain.impl.vision1.Student;
import cn.edu.nchu.grimsys.service.StudentService;
import cn.edu.nchu.grimsys.service.TeacherService;
import cn.edu.nchu.grimsys.util.StringHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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
@RequestMapping("/student")
@Controller
public class SPersonalInforManagement implements WebMvcConfigurer {
    @Autowired
    private StudentService studentService;
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

    }
    /**
     * 学生修改个人的信息
     * @param user
     * @param model
     * @param bindingResult
     * @param session
     * @return
     */
    @PostMapping("/updateStudent")
    public String updateStudent(@Validated Student user, Model model, BindingResult bindingResult, HttpSession session){
        if (bindingResult.hasFieldErrors()){//绑定有错
            model.addAttribute(user);
            System.out.println("凉凉！");
            return  " ";
        }else
        if(studentService.updateStudent(user)){
            return "";//修改成功
        }else{//失败！
            return  " ";
        }
    }

    /**
     * 修改学生个人密码
     * @param session
     * @return
     */
    @PostMapping("/updateStudentPass")
    public String updateAdminPass(Model model, HttpSession session, HttpServletRequest request){
        AbstrStudent student = (AbstrStudent)session.getAttribute("student");
        String oldPassword=request.getParameter("oldPassword");
        String newPassword=request.getParameter("newPassword");
        String confirmPassword=request.getParameter("confirmPassword");
        String realPassword=student.getPassword();
        if(StringHelper.empty(oldPassword)||StringHelper.empty(newPassword)){
            if(StringHelper.encrypt(realPassword).equals(oldPassword)){
                if(newPassword.equals(confirmPassword)) {
                    student.setPassword(newPassword);
                    if (studentService.updateStudent((Student)student)){
                        session.setAttribute("admin",student);
                        return "redirect:/admin/admin-back";


                    }else{
                        model.addAttribute("admin",student);
                        model.addAttribute("errorMsg","数据库更新失败！");
                        return  "/admin/admin-info-update";
                    }
                }else{
                    model.addAttribute("admin",student);
                    model.addAttribute("errorMsg","两次密码输入不一致错误！");
                    return  "/admin/admin-info-update";
                }


            }else{
                model.addAttribute("admin",student);
                model.addAttribute("errorMsg","原密码错误！");
                return  "/admin/admin-info-update";
            }
        }else{
            model.addAttribute("admin",student);
            model.addAttribute("errorMsg","选项均不能为空！");
            return  "/admin/admin-info-update";
        }

    }
}
