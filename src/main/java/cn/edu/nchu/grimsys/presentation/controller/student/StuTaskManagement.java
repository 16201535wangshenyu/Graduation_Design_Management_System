package cn.edu.nchu.grimsys.presentation.controller.student;

import cn.edu.nchu.grimsys.domain.impl.vision1.TaskImpl;
import cn.edu.nchu.grimsys.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
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
@RequestMapping("/student")
@Controller
public class StuTaskManagement implements WebMvcConfigurer {
    @Autowired
    TaskService service;
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

    }
    @RequestMapping("/loadAllTask/{studentId}")
    public String loadAllTask(@PathVariable("studentId") String studentId, Model model, HttpSession session){
        List<TaskImpl> taskList=service.loadAllTaskBysno(studentId);
        session.setAttribute("taskList",taskList);
        return "";

    }

   /* public */


}
