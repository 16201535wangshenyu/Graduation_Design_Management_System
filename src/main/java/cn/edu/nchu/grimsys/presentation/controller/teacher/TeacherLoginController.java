package cn.edu.nchu.grimsys.presentation.controller.teacher;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/teacher")
public class TeacherLoginController implements WebMvcConfigurer {
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

}
