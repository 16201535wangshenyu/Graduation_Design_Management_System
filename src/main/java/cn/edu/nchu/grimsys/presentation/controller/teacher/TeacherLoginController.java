package cn.edu.nchu.grimsys.presentation.controller.teacher;

import cn.edu.nchu.grimsys.domain.AbstrStudent;
import cn.edu.nchu.grimsys.domain.AbstrTeacher;
import cn.edu.nchu.grimsys.domain.impl.vision1.Student;
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
        registry.addViewController("/teacherIndex").setViewName("/teacher/teacherIndex");


    }
    /**
     * 教师登录界面
     * @return
     */
    @PostMapping("/login")
    public ModelAndView logincheck(ModelAndView modelAndView, HttpServletRequest request) {

        modelAndView.addObject("","");
        return modelAndView;
    }
    /**
     * 验证教师登录
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
        if(teacherService.validUser(user.getId()+"",user.getPassword())) {
            System.out.println("2凉凉！");
            AbstrTeacher teacher = teacherService.loadTeacherInfo(user.getId()+"");
            session.setAttribute("teacher",teacher);
            return "redirect:admin/index";
        }
        else{
            System.out.println("3凉凉！");
            model.addAttribute("errorMsg","账号或密码错误！");
            return "index";
        }

    }

}
