package cn.edu.nchu.grimsys.presentation.controller.admin;

import cn.edu.nchu.grimsys.domain.AbstrTeacher;
import cn.edu.nchu.grimsys.domain.impl.vision1.Admin;
import cn.edu.nchu.grimsys.domain.impl.vision1.Teacher;
import cn.edu.nchu.grimsys.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 162015班 第11组
 * 毕设信息管理系统--模块
 * @author ：
 * date：
 * 主要功能说明：
 */
@RequestMapping("/admin")
@Controller
public class TeacherInfoManagement implements WebMvcConfigurer {
    @Autowired
    private TeacherService teacherService;
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

    }

    /**
     * 增加教师
     * @param teacher
     * @param bindingResult
     * @param model
     * @param session
     * @return
     */
    @RequestMapping("/addTeacher")
    public String addTeacher(@Validated Teacher teacher, BindingResult bindingResult, Model model, HttpSession session){
        if (bindingResult.hasFieldErrors()){
            model.addAttribute(teacher);
            /* System.out.println("凉凉！");*/
            return  "index";
        }else
        if(teacherService.addTeacher(teacher)) {
            List<Teacher> teacherList=teacherService.loadAllTeacher();
            session.setAttribute("teacherList",teacherList);
            return "redirect:admin/index";
        }
        else{
            System.out.println("3凉凉！");
            model.addAttribute("errorMsg","增加教师失败，请稍后重试！");
            return "index";
        }

    }

    /**
     * 加载所有的教师
     * @param session
     * @return
     */
    @RequestMapping("/loadAllTeacher")
    public String loadAllTeacher(HttpSession session ) {
        List<Teacher> teacherList=teacherService.loadAllTeacher();

        session.setAttribute("teacherList",teacherList);
        return "";

    }

    /**
     * 删除某一个教师信息，根据教师ID
     * @param teacherId
     * @param model
     * @return
     */
    @RequestMapping("/getUserInfo/{teacherId}")
    public String deleteTeacher(@PathVariable("teacherId") String teacherId,Model model,HttpSession session){
        if(teacherService.deleteTeacherById(teacherId)){
            List<Teacher> teacherList=teacherService.loadAllTeacher();

            session.setAttribute("teacherList",teacherList);
            return "";

        }else{
            model.addAttribute("errorMsg","教师信息删除失败，请稍后重试！");
            return "";
        }
    }

    /**
     * 管理院修改某一个教师的信息
     * @param user
     * @param model
     * @param bindingResult
     * @param session
     * @return
     */
    @PostMapping("/updateTeacher")
    public String updateTeacher(@Validated Teacher user, Model model, BindingResult bindingResult, HttpSession session){
        if (bindingResult.hasFieldErrors()){//绑定有错
            model.addAttribute(user);
            System.out.println("凉凉！");
            return  " ";
        }else
        if(teacherService.updateTeacher(user)){
            return "";//修改成功
        }else{//失败！
            return  " ";
        }
    }


}
