package cn.edu.nchu.grimsys.presentation.controller.admin;

import cn.edu.nchu.grimsys.domain.AbstrAdmin;
import cn.edu.nchu.grimsys.domain.impl.vision1.Admin;
import cn.edu.nchu.grimsys.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * 162015班 第11组
 * 毕设信息管理系统--模块
 * @author ：
 * date：
 * 主要功能说明：
 */
@RequestMapping("/admin")
@Controller
public class AdminLoginController implements WebMvcConfigurer {

    @Autowired
    AdminService adminService;
    /**
     * 配置管理员页面get视图映射
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

        registry.addViewController("admin/index").setViewName("/admin/adminIndex");
        /*registry.addViewController("index").setViewName("index");*/
    }

    /**
     * 验证管理员登录
     * @return
     */
    @PostMapping("/logincheck")
    public String logincheck(@Validated Admin user, Model model, BindingResult bindingResult, HttpSession session, HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

      /*  String username=request.getParameter("username");
        String password=request.getParameter("password");
        String code =request.getParameter("code");*/
        System.out.println("1凉凉！");
        if (bindingResult.hasFieldErrors()){
            model.addAttribute("admin",user);
            System.out.println("凉凉！");
            return  "index";
        }
        else
        if(adminService.validUser(user.getId(),user.getPassword())) {
            System.out.println("2凉凉！");
            AbstrAdmin admin = adminService.loadAdminInfo(user.getId());
            model.addAttribute("admin",admin);
            return "redirect:admin/index";
        }
        else{
            System.out.println("3凉凉！");
            model.addAttribute("errorMsg","账号或密码错误！");
            request.getRequestDispatcher("/login").forward(request,response);
            return "index";
        }

        }





}
