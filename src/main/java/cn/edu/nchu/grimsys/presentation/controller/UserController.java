package cn.edu.nchu.grimsys.presentation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    @RequestMapping(value="/login",method= RequestMethod.GET)
    private String login(){

        return "login";
    }



/*    @PostMapping("/login")
    public String logincheck(@Validated User user, BindingResult bindingResult, Model model) {
        if (bindingResult.hasFieldErrors()) {
            model.addAttribute(user);
            return "login";
        } else
            return "redirect:home";
    }*/

}
