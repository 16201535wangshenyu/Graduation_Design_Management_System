package cn.edu.nchu.grimsys.presentation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Controller
public class UserController implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

        registry.addViewController("/admin-info-update").setViewName("/admin/admin-info-update");
        registry.addViewController("/admin-info-view").setViewName("/admin/admin-info-view");
        registry.addViewController("/admin-search-notice").setViewName("/admin/admin-search-notice");
        registry.addViewController("/admin-search-student").setViewName("/admin/admin-search-student");
        registry.addViewController("/admin-search-teache").setViewName("/admin/admin-search-teacher");
        registry.addViewController("/adminIndex").setViewName("/admin/adminIndex");


        registry.addViewController("/ChooseTeacher").setViewName("/student/ChooseTeacher");
        registry.addViewController("/LoadAllTask").setViewName("/student/LoadAllTask");
        registry.addViewController("/SearchAnnouncement").setViewName("/student/SearchAnnouncement");
        registry.addViewController("/SubmitTask").setViewName("/student/SubmitTask");
        registry.addViewController("/UpdateTask").setViewName("/student/UpdateTask");
        registry.addViewController("/ViewCourse").setViewName("/student/ViewCourse");
        registry.addViewController("/studentIndex").setViewName("/student/studentIndex");

        registry.addViewController("/teacherIndex").setViewName("/teacher/teacherIndex");

        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/index").setViewName("main");
    }

    @RequestMapping(value="/login",method= RequestMethod.GET)
    private String login(){

        return "login";
    }



/*    @PostMapping("/login")
    public String logincheck(@Validated User user, BindingResult bindingResult, Model model) {
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute(user);
            return "login";
        } else
            return "redirect:home";
    }*/

}
