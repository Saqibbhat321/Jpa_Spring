package com.xworkz.xworkmodule.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.xworkz.xworkmodule.entity.ModuleEntity;
import com.xworkz.xworkmodule.repository.ModuleRepo;
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
public class LoginController {

    @Autowired
    private ModuleService service;

    @Autowired
    private ModuleRepo repo;
    @Autowired
    private  BCryptPasswordEncoder encoderPassword;

    @PostMapping("/login")
    public String onLogin(@RequestParam String email, @RequestParam String password, Model model
    ) {
        ModuleEntity entity = service.checkLogin(email, password);
        boolean passwordMatched = encoderPassword.matches(password, entity.getAutoGeneratedPassword());

        if (entity.getLogin_count() > 3 ) {
            System.out.println("Account Locked");

            model.addAttribute("locked", "Your Account is Locked");
            return "Login";
        }
        if (entity == null || !passwordMatched) {
            model.addAttribute("msg", "Wrong Credentials");
            return "Login";
        }
        if (entity.getLogin_count() < 0) {
            System.out.println("First time login for " + email);
            model.addAttribute("email", email);
            return "UpdatePassword";
        }
        if (passwordMatched) {
            System.out.println("Not a First time Login....");
            model.addAttribute("msg", entity.getName());
            model.addAttribute("email", entity.getEmail());

            return "Success";
        } else {
            return "Login";
        }

    }

}
