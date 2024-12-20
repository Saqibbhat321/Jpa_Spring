package com.xworkz.xworkmodule.controller;

import com.xworkz.xworkmodule.dto.ModuleDto;
import com.xworkz.xworkmodule.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
///@RequestMapping("/")
public class ModuleController {
    @Autowired
    private ModuleService service;

    @PostMapping("/submit")
    public String onSubmit(ModuleDto dto) {
        boolean msg = service.Validate(dto);
        System.out.println(msg);
        return "SignUp.jsp";
    }

    @PostMapping("/search")
    public String onSearch(@RequestParam String email, @RequestParam String password, Model model) {
        String valid = service.getName(email, password);
        model.addAttribute("nam", valid);

        return "login";
    }


}





