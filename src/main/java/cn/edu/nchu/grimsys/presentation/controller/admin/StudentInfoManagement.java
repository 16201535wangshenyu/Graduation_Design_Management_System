package cn.edu.nchu.grimsys.presentation.controller.admin;

import cn.edu.nchu.grimsys.domain.impl.vision1.Student;
import cn.edu.nchu.grimsys.domain.impl.vision1.Teacher;
import cn.edu.nchu.grimsys.service.StudentService;
import cn.edu.nchu.grimsys.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 162015班 第11组
 * 毕设信息管理系统--模块
 * @author ：
 * date：
 * 主要功能说明：
 */
@RequestMapping("/admin")
@Controller
public class StudentInfoManagement implements WebMvcConfigurer {
    @Autowired
    private StudentService studentService;

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("");
    }



    /**
     * 增加学生
     * @param student
     * @param bindingResult
     * @param model
     * @param session
     * @return
     */
    @RequestMapping("/addStudent")
    public String addStudent(@Validated Student student, BindingResult bindingResult, Model model, HttpSession session){
        if (bindingResult.hasFieldErrors()){
            model.addAttribute(student);
            /* System.out.println("凉凉！");*/
            return  "index";
        }else
        if(studentService.addStudent(student)) {
            List<Student>  studentList=studentService.loadAllStudent();
            session.setAttribute("studentList",studentList);
            return "redirect:admin/index";
        }
        else{
            System.out.println("3凉凉！");
            model.addAttribute("errorMsg","增加学生失败，请稍后重试！");
            return "index";
        }

    }

    /**
     * 加载所有的学生
     * @param session
     * @return
     */
    @RequestMapping("/loadAllStudent")
    public String loadAllStudent(HttpSession session) {
        List<Student> studentList=studentService.loadAllStudent();

        session.setAttribute("teacherList",studentList);
        return "";

    }

    /**
     * 删除某一个学生信息，根据学生ID
     * @param studentId
     * @param model
     * @return
     */
    @RequestMapping("/deleteStudent/{studentId}")
    public String deleteStudent(@PathVariable("studentId") String studentId, Model model, HttpSession session){
        if(studentService.deleteStudentById(studentId)){
            List<Student> studentList=studentService.loadAllStudent();

            session.setAttribute("teacherList",studentList);
            return "";

        }else{
            model.addAttribute("errorMsg","学生信息删除失败，请稍后重试！");
            return "";
        }
    }

    /**
     * 管理院修改某一个学生的信息
     * @param user
     * @param model
     * @param bindingResult
     * @param session
     * @return
     */
    @PostMapping("/updateStudent")
    public String updateStudent(@Validated Student user, Model model, BindingResult bindingResult, HttpSession session){
        if (bindingResult.hasFieldErrors()){//绑定有错
            model.addAttribute(user);
            System.out.println("凉凉！");
            return  " ";
        }else
        if(studentService.updateStudent(user)){
            return "";//修改成功
        }else{//失败！
            return  " ";
        }
    }
}
