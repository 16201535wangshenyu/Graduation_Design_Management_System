package cn.edu.nchu.grimsys.presentation.controller.admin;

import cn.edu.nchu.grimsys.domain.AbstrAdmin;
import cn.edu.nchu.grimsys.domain.impl.vision1.Admin;
import cn.edu.nchu.grimsys.domain.impl.vision1.Student;
import cn.edu.nchu.grimsys.domain.impl.vision1.Teacher;
import cn.edu.nchu.grimsys.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

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
        registry.addViewController("/admin/admin-index").setViewName("/admin/adminIndex");
       /* registry.addViewController("adminIndex").setViewName("/admin/adminIndex");*/
       /* registry.addViewController("index").setViewName("index");*/
    }

    /**
     * 验证管理员登录
     *  BindingResult bindingResult对象一定要紧跟着校验对象！！！！！！！！！！！！
     * @return
     */
    @PostMapping("/login")
    public String login(@Validated Admin admin, BindingResult bindingResult ,Model model,HttpSession session) {
      /*  String username=request.getParameter("username");
        String password=request.getParameter("password");
        String code =request.getParameter("code");*/
        System.out.println("哈哈我进来了！");
        if (bindingResult.hasFieldErrors()){
            model.addAttribute(admin);
            /*model.addAttribute("errorMessage","* 请输入6位数字");*/
            model.addAttribute(new Teacher());
            model.addAttribute(new Student());
            System.out.println("字段值有错误！");
            return  "index";
        }
        else
        if(adminService.validUser(admin.getId()+"",admin.getPassword())) {
            //登陆成功
            System.out.println("2凉凉！");
            System.out.println("ttttt"+admin.getId());
            AbstrAdmin abstrAdmin = adminService.loadAdminInfo(admin.getId()+"");
            System.out.println("mmmmmmm"+abstrAdmin.getTelephone());
            session.setAttribute("admin",abstrAdmin);

            return "redirect:admin-index";
        }
        else{
            System.out.println("3凉凉！");
            model.addAttribute(new Teacher());
            model.addAttribute(new Student());
            model.addAttribute("AdminLoginErrorMsg","账号或密码错误！");

            return "index";
        }

        }



}
