package cn.edu.nchu.grimsys.presentation.controller.teacher;

import cn.edu.nchu.grimsys.domain.AbstrStudent;
import cn.edu.nchu.grimsys.domain.AbstrTeacher;
import cn.edu.nchu.grimsys.domain.impl.vision1.Student;
import cn.edu.nchu.grimsys.domain.impl.vision1.Teacher;
import cn.edu.nchu.grimsys.service.Stu_tea_to_way_choiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
@RequestMapping("/teacher")
@Controller
public class ChooseBringStudents implements WebMvcConfigurer {
    @Autowired
    Stu_tea_to_way_choiceService stu_tea_to_way_choiceService;

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

    }
    @RequestMapping("/getUserInfo/{studentId}")
    public String choseStudent(String studentId, Model model, HttpSession session){
      AbstrTeacher teacher =(Teacher)session.getAttribute("teacher") ;

        if(stu_tea_to_way_choiceService.selecStudent(studentId,teacher.getId()+"")) {
            return "";

        }else
        {
            model.addAttribute("errorMsg","选择学生失败，请稍后重试");
        return "";
        }

    }
}
