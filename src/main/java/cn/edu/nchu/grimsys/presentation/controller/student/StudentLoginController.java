package cn.edu.nchu.grimsys.presentation.controller.student;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.http.HttpServletRequest;

/**
 * 162015班  第11组
 * 毕设信息管理系统--模块
 * @author：
 * date：2019-6-
 * 主要功能说明：
 */
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
