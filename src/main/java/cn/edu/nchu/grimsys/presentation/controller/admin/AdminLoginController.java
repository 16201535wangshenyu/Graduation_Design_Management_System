package cn.edu.nchu.grimsys.presentation.controller.admin;

import cn.edu.nchu.grimsys.domain.AbstrAdmin;
import cn.edu.nchu.grimsys.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


@Controller
@RequestMapping("/admin")
public class AdminLoginController implements WebMvcConfigurer {

    @Autowired
    AdminService adminService;
    /**
     * 配置管理员页面get视图映射
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

        registry.addViewController("/index").setViewName("/admin/adminIndex.html");

    }

    /**
     * 管理员登录界面
     * @return
     */
    @PostMapping("/login")
    public ModelAndView logincheck(ModelAndView modelAndView, HttpServletRequest request) {

        String username=request.getParameter("username");
        String password=request.getParameter("password");
        String code =request.getParameter("code");

        if(adminService.validUser(username,password))



        modelAndView.addObject("","");


        return modelAndView;
        }





    }
