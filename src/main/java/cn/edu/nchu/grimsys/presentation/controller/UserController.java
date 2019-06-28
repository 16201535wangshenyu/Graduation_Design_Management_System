package cn.edu.nchu.grimsys.presentation.controller;

import cn.edu.nchu.grimsys.util.GraphicHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 162015班  第11组
 * 毕设信息管理系统--模块
 * @author：
 * date：2019-6-
 * 主要功能说明：
 */
@Controller

public class UserController implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {
       /* registry.addViewController("/admin-info-update").setViewName("/admin/admin-info-update");


        registry.addViewController("/admin-info-view").setViewName("/admin/admin-info-view");
        registry.addViewController("/admin-search-notice").setViewName("/admin/admin-search-notice");
        registry.addViewController("/admin-search-student").setViewName("/admin/admin-search-student");
        registry.addViewController("/admin-search-teache").setViewName("/admin/admin-search-teacher");


        registry.addViewController("/ChooseTeacher").setViewName("/student/ChooseTeacher");
        registry.addViewController("/LoadAllTask").setViewName("/student/LoadAllTask");
        registry.addViewController("/SearchAnnouncement").setViewName("/student/SearchAnnouncement");
        registry.addViewController("/SubmitTask").setViewName("/student/SubmitTask");
        registry.addViewController("/UpdateTask").setViewName("/student/UpdateTask");
        registry.addViewController("/ViewCourse").setViewName("/student/ViewCourse");



        registry.addViewController("/").setViewName("main");
        registry.addViewController("/index").setViewName("index");*/
    }


   /* @RequestMapping(value="/login",method= RequestMethod.GET)
    private String login(){

        return "login";
    }*/



/*    @PostMapping("/login")
    public String logincheck(@Validated User user, BindingResult bindingResult, Model model) {
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute(user);
            return "login";
        } else
            return "redirect:home";
    }*/

    /**
     * 更换验证码图片
     * @param model
     * @return
     */
        @RequestMapping(value="/requestCode",method= RequestMethod.GET)
        private String changeCode(Model model){
            model.addAttribute("codeValue",changePic());

            return "login";
        }

    /**
     * 更换验证码图片
     * @return
     */
    private String changePic(){
        String code="";
        try {
            File file=new File("G:\\WEB高级编程综合课程设计\\WEB-Course-Design\\src\\main\\resources\\static\\images\\codeImg\\code.img");
            if(file.exists())
                file.delete();
            file.createNewFile();
            code=GraphicHelper.create(4,false,300,100,new FileOutputStream(file),10);

        }catch (IOException e){
            e.printStackTrace();
        }
        return  code;

        }


}
