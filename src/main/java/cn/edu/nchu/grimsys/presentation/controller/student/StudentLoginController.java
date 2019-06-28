package cn.edu.nchu.grimsys.presentation.controller.student;

import cn.edu.nchu.grimsys.domain.AbstrStudent;
import cn.edu.nchu.grimsys.domain.impl.vision1.Student;
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
        registry.addViewController("/studentIndex").setViewName("/student/studentIndex");

    }
    /**
     * 学生登录界面
     * @return
     */
    @PostMapping("/login")
    public ModelAndView logincheck(ModelAndView modelAndView, HttpServletRequest request) {

        modelAndView.addObject("","");

        return modelAndView;
    }

    /**
     * 验证学生登录
     * @return
     */
    @PostMapping("/student/login")
    public String logincheck(@Validated Student user, Model model, BindingResult bindingResult, HttpSession session, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        if (bindingResult.hasFieldErrors()){
            model.addAttribute("admin",user);
           /* System.out.println("凉凉！");*/
            return  "index";
        }
        else
        if(studentService.validUser(user.getId(),user.getPassword())) {
            System.out.println("2凉凉！");
            AbstrStudent student = studentService.loadAdminInfo(user.getId());
            session.setAttribute("student",student);
            return "redirect:admin/index";
        }
        else{
            System.out.println("3凉凉！");
            model.addAttribute("errorMsg","账号或密码错误！");
            return "index";
        }

    }
}
