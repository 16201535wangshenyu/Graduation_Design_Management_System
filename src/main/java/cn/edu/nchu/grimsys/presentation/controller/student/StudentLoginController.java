package cn.edu.nchu.grimsys.presentation.controller.student;

import cn.edu.nchu.grimsys.domain.AbstrStudent;
import cn.edu.nchu.grimsys.domain.impl.vision1.Admin;
import cn.edu.nchu.grimsys.domain.impl.vision1.Student;
import cn.edu.nchu.grimsys.domain.impl.vision1.Teacher;
import cn.edu.nchu.grimsys.service.StudentService;
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
@RequestMapping("/student")
public class StudentLoginController implements WebMvcConfigurer{
    @Autowired
    StudentService studentService;

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/student/student-index").setViewName("/student/studentIndex");

    }

    /**
     * 验证学生登录
     * @return
     */
    @PostMapping("/login")
    public String logincheck(@Validated Student user, BindingResult bindingResult ,Model model,HttpSession session) {
        if (bindingResult.hasFieldErrors()){
            model.addAttribute(user);
           /* System.out.println("凉凉！");*/
            model.addAttribute(new Admin());
            model.addAttribute(new Teacher());
            System.out.println("字段值有错误！");
            return  "index";
        }
        else
        if(studentService.validUser(user.getId()+"",user.getPassword())) {
            System.out.println("2凉凉！");
            AbstrStudent student = studentService.loadAdminInfo(user.getId()+"");
            session.setAttribute("student",student);
            return "redirect:student-index";
        }
        else{
            System.out.println("3凉凉！");
            model.addAttribute(new Teacher());
            model.addAttribute(new Admin());
            model.addAttribute("StudentLoginErrorMsg","账号或密码错误！");
            return "index";
        }

    }
}
