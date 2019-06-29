package cn.edu.nchu.grimsys.presentation.controller.admin;

import cn.edu.nchu.grimsys.domain.AbstrAdmin;
import cn.edu.nchu.grimsys.domain.impl.vision1.Admin;
import cn.edu.nchu.grimsys.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.PrintWriter;

/**
 * 162015班 第11组
 * 毕设信息管理系统--模块
 * @author ：
 * date：
 * 主要功能说明：
 */
@RequestMapping("/admin")
@Controller
public class PersonalInforManagement implements WebMvcConfigurer {
    @Autowired
    AdminService adminService;

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

        registry.addViewController("/admin/admin-info-update").setViewName("/admin/admin-info-update");
        registry.addViewController("/admin/admin-back").setViewName("/admin/back");
    }


    @RequestMapping(value="/admin-info-update",method= RequestMethod.GET)
    private String updateAdminInfo(Model model,HttpSession session){
        AbstrAdmin admin =(AbstrAdmin)session.getAttribute("admin");
        model.addAttribute(admin);
        return "/admin/admin-info-update";
    }
    /**
     * 修改管理员个人信息
     * @param admin
     * @param bindingResult
     * @param session
     * @return
     */
    @PostMapping("/updateAdmin")
    public String updateAdmin(@Validated Admin admin, BindingResult bindingResult, HttpServletRequest request, Model model, HttpSession session){
        System.out.println(admin.getId());
        System.out.println(admin.getName());
        System.out.println(admin.getGender());
        System.out.println(admin.getBirthday());
        System.out.println(admin.getFaculties());
        System.out.println(admin.getEmploy_time());
        System.out.println(admin.getProfession_title());
        System.out.println(admin.getTelephone());
        System.out.println(admin.getIDcard_type());
        System.out.println(admin.getIDcard_number());
        System.out.println(admin.getPassword());
        AbstrAdmin abstrAdmin = (AbstrAdmin)session.getAttribute("admin");


        admin.setId(abstrAdmin.getId());
        admin.setName(abstrAdmin.getName());
        admin.setBirthday(request.getParameter("Birthday"));
        admin.setEmploy_time(request.getParameter("employ_time"));
        admin.setIDcard_type(request.getParameter("IDcard_type"));
        admin.setPassword(request.getParameter("password"));

        System.out.println("lalalalalal");
        System.out.println(admin.getId());
        System.out.println(admin.getName());
        System.out.println(admin.getGender());
        System.out.println(admin.getBirthday());
        System.out.println(admin.getFaculties());
        System.out.println(admin.getEmploy_time());
        System.out.println(admin.getProfession_title());
        System.out.println(admin.getTelephone());
        System.out.println(admin.getIDcard_type());
        System.out.println(admin.getIDcard_number());
        System.out.println(admin.getPassword());
        if (bindingResult.hasFieldErrors()){//绑定有错

            model.addAttribute("admin",admin);
            model.addAttribute(admin);
            System.out.println("修改凉凉！");
            return  "/admin/admin-info-update";
        }else
        if(adminService.updateAdmin(admin)){
            //修改成功，一并将session中的admin修改

            System.out.println(admin.getTelephone());
            session.setAttribute("admin",admin);
            System.out.println("修改成功");

            session.setAttribute("current","info-view");
            //使用在controller中注册的全部路径继续重定向
            return "redirect:/admin/admin-back";//修改成功,返回显示个人信息界面
        }else{//失败！
            System.out.println("修改失败");
            System.out.println(admin.getIDcard_number());
            return  " ";
        }
    }


}
