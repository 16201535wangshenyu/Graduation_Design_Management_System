package cn.edu.nchu.grimsys.presentation.controller.student;

import cn.edu.nchu.grimsys.domain.AbstrStudent;
import cn.edu.nchu.grimsys.domain.AbstrTeacher;
import cn.edu.nchu.grimsys.domain.impl.vision1.Student;
import cn.edu.nchu.grimsys.service.Stu_tea_to_way_choiceService;
import cn.edu.nchu.grimsys.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.http.HttpSession;

/**
 * 162015班 第11组
 * 毕设信息管理系统--模块
 * @author ：
 * date：
 * 主要功能说明：
 */
@RequestMapping("/student")
@Controller
public class ChoosingTeacher implements WebMvcConfigurer {
    @Autowired
    Stu_tea_to_way_choiceService service;@Autowired
    private TeacherService teacherService;


    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

    }

    @RequestMapping("selectTeacher/{teacherId}")
    public String selectTeacher(@PathVariable("teacherId") String teacherId, Model model, HttpSession session) {
        AbstrStudent student= (Student)session.getAttribute("student");
        if(service.selectTeacher(student,teacherId)){
            AbstrTeacher teacher=teacherService.loadTeacherInfo(teacherId);
            session.setAttribute("selectedTeacher",teacher);
            return "";
        }else{
            return "";
        }
    }

}
