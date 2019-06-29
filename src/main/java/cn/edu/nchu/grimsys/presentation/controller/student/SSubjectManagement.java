package cn.edu.nchu.grimsys.presentation.controller.student;

import cn.edu.nchu.grimsys.domain.AbstrStudent;
import cn.edu.nchu.grimsys.domain.AbstrSubject;
import cn.edu.nchu.grimsys.domain.impl.vision1.Student;
import cn.edu.nchu.grimsys.service.SubjectService;
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
public class SSubjectManagement implements WebMvcConfigurer {
    @Autowired
    SubjectService service;


    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

    }

    /**
     * 学生查看自己所选课题
     * @param studentId
     * @param model
     * @param session
     * @return
     */

    @RequestMapping("/lookSubjectBySno/{studentId}")
    public String lookSubjectBySno(@PathVariable("studentId") String studentId, Model model, HttpSession session) {
        AbstrSubject subject=service.loadSubjectBySno(studentId);
        session.setAttribute("mySubject",subject);
        return "";
    }

    /**
     * 学生退选课题
     * @param SubjectId
     * @param model
     * @param session
     * @return
     */
    @RequestMapping("/WithdrawalSubject/{SubjectId}")
    public String WithdrawalSubject(@PathVariable("SubjectId") String SubjectId, Model model, HttpSession session){
        if(service.WithdrawalSubject(SubjectId)){
            return "";
        }else{
            model.addAttribute("errorMsg","退选失败，请稍后重试！");
            return "";
        }
    }

    /**
     * 学生选择某课题
     * @param SubjectId
     * @param model
     * @param session
     * @return
     */
    @RequestMapping("/chooseSubject/{SubjectId}")
    public String chooseSubject(@PathVariable("SubjectId") String SubjectId, Model model, HttpSession session){
        AbstrStudent student=(Student)session.getAttribute("student");
        if(service.chooseSubject(SubjectId,student.getId()+"")){

            return "redirect:/WithdrawalSubject/"+SubjectId;
        }else{
            model.addAttribute("errorMsg","选择课题失败，请稍后重试！");
            return "";
        }
    }

}
