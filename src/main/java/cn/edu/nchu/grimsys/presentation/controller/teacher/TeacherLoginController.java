package cn.edu.nchu.grimsys.presentation.controller.teacher;

import cn.edu.nchu.grimsys.domain.AbstrStudent;
import cn.edu.nchu.grimsys.domain.AbstrTeacher;
import cn.edu.nchu.grimsys.domain.impl.vision1.Admin;
import cn.edu.nchu.grimsys.domain.impl.vision1.Student;
import cn.edu.nchu.grimsys.domain.impl.vision1.Teacher;
import cn.edu.nchu.grimsys.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * 162015班 第11组
 * 毕设信息管理系统--模块
 * @author ：
 * date：
 * 主要功能说明：
 */
@Controller
@RequestMapping("/teacher")
public class TeacherLoginController implements WebMvcConfigurer {
    @Autowired
    private TeacherService teacherService;
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/teacher/teacher-index").setViewName("/teacher/teacherIndex");


    }

    /**
     * 验证教师登录
     * @return
     */
    @PostMapping("/login")
    public String logincheck(@Validated Teacher teacher, BindingResult bindingResult ,Model model,HttpSession session) {


        if (bindingResult.hasFieldErrors()){
            model.addAttribute(teacher);
            model.addAttribute(new Admin());
            model.addAttribute(new Student());
            /* System.out.println("凉凉！");*/
            return  "index";
        }
        else
        if(teacherService.validUser(teacher.getId()+"",teacher.getPassword())) {
            System.out.println("2凉凉！");
            AbstrTeacher abstrTeacher = teacherService.loadTeacherInfo(teacher.getId()+"");
            session.setAttribute("teacher",abstrTeacher);
            return "redirect:teacher-index";
        }
        else{
            System.out.println("3凉凉！");
            model.addAttribute(new Admin());
            model.addAttribute(new Student());
            model.addAttribute("TeacherLoginErrorMsg","账号或密码错误！");
            return "index";
        }

    }

}
