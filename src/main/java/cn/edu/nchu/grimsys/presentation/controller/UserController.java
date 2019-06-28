package cn.edu.nchu.grimsys.presentation.controller;

import cn.edu.nchu.grimsys.domain.AbstrUser;
import cn.edu.nchu.grimsys.domain.impl.vision1.Admin;
import cn.edu.nchu.grimsys.domain.impl.vision1.Student;
import cn.edu.nchu.grimsys.domain.impl.vision1.Teacher;
import cn.edu.nchu.grimsys.util.GraphicHelper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 162015班 第11组
 * 毕设信息管理系统--模块
 * @author ：
 * date：
 * 主要功能说明：
 */
@Controller
public class UserController implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/adminIndex").setViewName("/admin/adminIndex");
        registry.addViewController("/studentIndex").setViewName("/student/studentIndex");
        registry.addViewController("/teacherIndex").setViewName("/teacher/teacherIndex");
    }
    @RequestMapping(value="/login",method=RequestMethod.GET)
    private String login(Student student,Teacher teacher,Admin admin){

        return "index";
    }



    /**
     * 更换验证码图片
     * @param model
     * @return
     */
        @RequestMapping(value="/requestCode",method= RequestMethod.GET)
        private String changeCode(Model model){
            model.addAttribute("codeValue",changePic());

            return "redirect:login";
        }
    /**
     * 更换验证码图片
     * @return
     */
    public String changePic(){
        String code="";
        try {
            File file=new File("G:\\WEB高级编程综合课程设计\\WEB-Course-Design\\src\\main\\resources\\static\\images\\codeImg\\code.jpg");
            if(file.exists())
                file.delete();
            file.createNewFile();
            code=GraphicHelper.create(4,false,300,100,new FileOutputStream(file),30);
        }catch (IOException e){
            e.printStackTrace();
        }
        return  code;
        }


}
