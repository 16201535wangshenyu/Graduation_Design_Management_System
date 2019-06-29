package cn.edu.nchu.grimsys.presentation.controller.teacher;

import cn.edu.nchu.grimsys.domain.AbstrSubject;
import cn.edu.nchu.grimsys.domain.impl.vision1.Admin;
import cn.edu.nchu.grimsys.domain.impl.vision1.SubjectImpl;
import cn.edu.nchu.grimsys.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;


/**
 * 162015班 第11组
 * 毕设信息管理系统--模块
 * @author ：
 * date：
 * 主要功能说明：
 */
@RequestMapping("/teacher")
@Controller
public class TSubjectManagement implements WebMvcConfigurer {
    @Autowired
    SubjectService service;
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

    }

    /**
     * 教师查看自己以创建的课题
     * @param teacherId
     * @param model
     * @param session
     * @return
     */
    @RequestMapping("/lookSubjectByTno/{teacherId}")
    public String lookSubjectByTno(@PathVariable("teacherId") String teacherId, Model model, HttpSession session) {
        List<SubjectImpl> subjectList=service.loadSubjectByTno(teacherId);
        session.setAttribute("subjectList",subjectList);
        return "";
    }
    /**
     * 教师查看自己以提交的课题
     * @param teacherId
     * @param model
     * @param session
     * @return
     */
    @RequestMapping("/lookSubmittedSubjectByTno/{teacherId}")
    public String lookSubmittedSubjectByTno(@PathVariable("teacherId") String teacherId, Model model, HttpSession session) {
        List<SubjectImpl> subjectList=service.loadSubmittedSubjectByTno(teacherId);
        session.setAttribute("subjectList",subjectList);
        return "";
    }
    @RequestMapping("/createSubject")
    public String createSubject(@Validated SubjectImpl subject, Model model, BindingResult bindingResult, HttpSession session, HttpServletRequest request, HttpServletResponse response) {
        if(service.createSubject(subject))
            return "redirect:/";
        else {
            return "";
        }
    }




}
