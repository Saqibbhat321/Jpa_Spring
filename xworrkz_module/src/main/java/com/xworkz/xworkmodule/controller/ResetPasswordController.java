package com.xworkz.xworkmodule.controller;

import com.xworkz.xworkmodule.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class ResetPasswordController {

    @Autowired
    ModuleService service;


    @PostMapping("/resetPassword")
    public String resetPassword(@RequestParam String email, @RequestParam String newPassword, Model model) {
        boolean passwordChanged = service.resetPassword(email, newPassword);
        System.out.println("this is reset controller");
        System.out.println("controller got "+passwordChanged);
        if (passwordChanged) {
            model.addAttribute("resetPwdMessage", "Password Successfully changed");
            System.out.println("password changed successful");
        } else {
            model.addAttribute("resetPwdMessage", "Failed to change password");
            System.out.println("password change failed");
        }
        return "ResetPassword"; // Ensure this matches your JSP file name
    }
}
