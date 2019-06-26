package cn.edu.nchu.grimsys.presentation.controller.student;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping("/student")
public class StudentLoginController implements WebMvcConfigurer{
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
}
