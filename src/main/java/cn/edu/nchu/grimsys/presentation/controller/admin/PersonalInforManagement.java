package cn.edu.nchu.grimsys.presentation.controller.admin;

import cn.edu.nchu.grimsys.domain.AbstrAdmin;
import cn.edu.nchu.grimsys.domain.AbstrStudent;
import cn.edu.nchu.grimsys.domain.impl.vision1.Admin;
import cn.edu.nchu.grimsys.domain.impl.vision1.Student;
import cn.edu.nchu.grimsys.service.AdminService;
import cn.edu.nchu.grimsys.util.StringHelper;
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
        AbstrAdmin abstrAdmin = (AbstrAdmin)session.getAttribute("admin");
        admin.setId(abstrAdmin.getId());
        admin.setName(abstrAdmin.getName());
        admin.setBirthday(request.getParameter("Birthday"));
        admin.setEmploy_time(request.getParameter("employ_time"));
        admin.setIDcard_type(request.getParameter("IDcard_type"));
        admin.setPassword(request.getParameter("password"));
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
            model.addAttribute(admin);
            session.setAttribute("current","info-view");
            //使用在controller中注册的全部路径继续重定向
            return "redirect:/admin/admin-back";//修改成功,返回显示个人信息界面
        }else{//失败！
            System.out.println("修改失败");
            System.out.println(admin.getIDcard_number());
            model.addAttribute("errorMsg","管理员信息更新失败！");
            return  "/admin/admin-info-update";
        }
    }
    /**
     * 修改管理员个人密码
     * @param session
     * @return
     */
    @PostMapping("/updateAdminPass")
    public String updateAdminPass(Model model, HttpSession session, HttpServletRequest request){
        AbstrAdmin admin = (AbstrAdmin)session.getAttribute("admin");
        String oldPassword=request.getParameter("oldPassword");
        String newPassword=request.getParameter("newPassword");
        String confirmPassword=request.getParameter("confirmPassword");
        String realPassword=admin.getPassword();
        if(StringHelper.empty(oldPassword)||StringHelper.empty(newPassword)){
            if(StringHelper.encrypt(realPassword).equals(oldPassword)){
                if(newPassword.equals(confirmPassword)) {
                    admin.setPassword(newPassword);
                    if (adminService.updateAdmin((Admin)admin)){
                        session.setAttribute("admin",admin);
                        return "redirect:/admin/admin-back";


                    }else{
                        model.addAttribute("admin",admin);
                        model.addAttribute("errorMsg","数据库更新失败！");
                        return  "/admin/admin-info-update";
                    }
                }else{
                    model.addAttribute("admin",admin);
                    model.addAttribute("errorMsg","两次密码输入不一致错误！");
                    return  "/admin/admin-info-update";
                }


            }else{
                model.addAttribute("admin",admin);
                model.addAttribute("errorMsg","原密码错误！");
                return  "/admin/admin-info-update";
            }
        }else{
            model.addAttribute("admin",admin);
            model.addAttribute("errorMsg","选项均不能为空！");
            return  "/admin/admin-info-update";
        }

    }






}
