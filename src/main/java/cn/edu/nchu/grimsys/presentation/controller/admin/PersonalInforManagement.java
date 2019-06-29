package cn.edu.nchu.grimsys.presentation.controller.admin;

import cn.edu.nchu.grimsys.domain.impl.vision1.Admin;
import cn.edu.nchu.grimsys.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
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
@RequestMapping("/admin")
@Controller
public class PersonalInforManagement implements WebMvcConfigurer {
    @Autowired
    AdminService adminService;

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {

    }
    /**
     * 修改管理员个人信息
     * @param user
     * @param model
     * @param bindingResult
     * @param session
     * @return
     */
    @PostMapping("/updateAdmin")
    public String updateAdmin(@Validated Admin user, Model model, BindingResult bindingResult, HttpSession session){
        if (bindingResult.hasFieldErrors()){//绑定有错
            model.addAttribute(user);
            System.out.println("凉凉！");
            return  " ";
        }else
        if(adminService.updateAdmin(user)){
            return "";//修改成功
        }else{//失败！
            return  " ";
        }
    }


}
