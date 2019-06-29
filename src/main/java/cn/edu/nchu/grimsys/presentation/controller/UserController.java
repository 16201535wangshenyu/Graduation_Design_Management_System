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
        //管理员
        /*registry.addViewController("/admin-index").setViewName("/admin/adminIndex");*/
        registry.addViewController("/admin-info-update").setViewName("/admin/admin-info-update");
        registry.addViewController("/admin-info-view").setViewName("/admin/admin-info-view");
        registry.addViewController("/admin-search-notice").setViewName("/admin/admin-search-notice");
        registry.addViewController("/admin-search-student").setViewName("/admin/admin-search-student");
        registry.addViewController("/admin-search-teacher").setViewName("/admin/admin-search-teacher");


        //学生
        registry.addViewController("/student-index").setViewName("/student/studentIndex");
        registry.addViewController("/student-info-view").setViewName("/student/student-info-view");
        registry.addViewController("/student-info-update").setViewName("/student/student-info-update");


        registry.addViewController("/student-view-subject").setViewName("/student/Student-load-subject");
        registry.addViewController("/student-choose-subject").setViewName("/student/ChooseSubject");


        registry.addViewController("/LoadAllTask").setViewName("/student/LoadAllTask");
        registry.addViewController("/SubmitTask").setViewName("/student/SubmitTask");
        registry.addViewController("/UpdateTask").setViewName("/student/UpdateTask");
        registry.addViewController("/SearchAnnouncement").setViewName("/student/SearchAnnouncement");
        registry.addViewController("/ChooseTeacher").setViewName("/student/ChooseTeacher");


        //教师
        registry.addViewController("/teacher-index").setViewName("/teacher/teacherIndex");

        registry.addViewController("/teacher-info-view").setViewName("/teacher/info-management/teacher-info-view");
        registry.addViewController("/teacher-info-update").setViewName("/teacher/info-management/teacher-info-update");


        registry.addViewController("/teacher-create-subject").setViewName("/teacher/subject-management/teacher-create-subject");
        registry.addViewController("/teacher-update-subject").setViewName("/teacher/subject-management/teacher-update-subject");
        registry.addViewController("/teacher-loadall-subject").setViewName("/teacher/subject-management/teacher-loadall-subject");
        registry.addViewController("/teacher-publish-subject").setViewName("/teacher/subject-management/teacher-publish-subject");
        registry.addViewController("/teacher-submit-subject").setViewName("/teacher/subject-management/teacher-submit-subject");



        registry.addViewController("/teacher-add-task").setViewName("/teacher/task-management/teacher-add-task");
        registry.addViewController("/teacher-delete-task").setViewName("/teacher/task-management/teacher-delete-task");
        registry.addViewController("/teacher-update-task").setViewName("/teacher/task-management/teacher-update-task");
        registry.addViewController("/teacher-loadall-task").setViewName("/teacher/task-management/teacher-loadall-task");



        registry.addViewController("/teacher-choose-student").setViewName("/teacher/teacher-choose-student");
        registry.addViewController("/teacher-load-pronnouncment").setViewName("/teacher/teacher-load-pronnouncment");


        registry.addViewController("/teacher-add-defense").setViewName("/teacher/defense-management/teacher-add-defense");
        registry.addViewController("/teacher-delete-defense").setViewName("/teacher/defense-management/teacher-delete-defense");
        registry.addViewController("/teacher-loadall-defense").setViewName("/teacher/defense-management/teacher-loadall-defense");
        registry.addViewController("/teacher-update-defense").setViewName("/teacher/defense-management/teacher-update-defense");



        //登陆





    }
    @RequestMapping(value="/login",method=RequestMethod.GET)
    private String login(Student student,Teacher teacher,Admin admin){

        return "index";
    }
  /*  @RequestMapping(value="/login",method=RequestMethod.POST)
    private String login2(Student student,Teacher teacher,Admin admin){

        return "index";
    }
*/

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
