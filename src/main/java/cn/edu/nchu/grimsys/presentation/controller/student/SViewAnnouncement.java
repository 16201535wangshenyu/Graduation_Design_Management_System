package cn.edu.nchu.grimsys.presentation.controller.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 162015班 第11组
 * 毕设信息管理系统--模块
 * @author ：
 * date：
 * 主要功能说明：
 */
@RequestMapping("/student")
@Controller
public class SViewAnnouncement implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {


    }
}
