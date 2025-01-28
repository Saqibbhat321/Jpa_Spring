package com.xworkz.xworkmodule.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.xworkz.xworkmodule.dto.ModuleDto;
import com.xworkz.xworkmodule.entity.ModuleEntity;
import com.xworkz.xworkmodule.repository.ModuleRepo;
import com.xworkz.xworkmodule.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.ConstraintViolation;
import java.util.Set;

@Controller
///@RequestMapping("/")
public class ModuleController {
    @Autowired
    private ModuleService service;
    ModuleEntity entity = new ModuleEntity();
    @Autowired
    private ModuleRepo repo;


    @PostMapping("/submit")
    public String onSubmit(ModuleDto dto,Model model) {
        System.out.println("executing onSubit in COntroller");
        service.Validate(dto);
        model.addAttribute("signup", "Sign Up Successful");

        return "SignUp";
    }

//    @PostMapping("/login")
//    public String onLogin(@RequestParam String email, @RequestParam String password, Model model) {
//
//        ModuleDto moduleDto = service.checkLogin(email, password);
////        System.out.println(moduleDto);
//        System.out.println("controller gets " + moduleDto);
//        if (moduleDto == null) {
//            model.addAttribute("error","Wrong Credentials");
//            System.err.println("Wrong password....");
//            return "Login.jsp";
//        }if (moduleDto.getLogin_count() >=3) {
//            System.err.println("Your Account is LOcked");
//            model.addAttribute("locked", "Your Account is Locked");
//            return "Login.jsp";
//
//        }else if(moduleDto.getLogin_count() < 0) {
//            System.out.println("First time login for " + email);
//            model.addAttribute("email", email);
//            return "UpdatePassword.jsp";
//        }
//         else {
//            System.out.println("Not a First time Login....");
//            model.addAttribute("msg", moduleDto.getName());
//            return "Login.jsp";
//        }
//
//    }


    @PostMapping("/update")
    public String updatePwd(@RequestParam String email, @RequestParam String autogeratedpassword, @RequestParam String newPassword, @RequestParam String confirmPassword, Model model) {

        ModuleEntity moduleEntity = service.updatePassword(email, autogeratedpassword, newPassword, confirmPassword);
        System.out.println(moduleEntity);
        if (moduleEntity != null) {

            System.out.println("password changed successfully");
            model.addAttribute("changePwd", "password changed successfully");
        }
        return "Login";

    }
    @PostMapping("/updateDetails")
    public String updateDetails( String name, String alterEmail,String location,double phNo,String email, double alterPhNo,Model model)
    {
        ModuleDto dto = new ModuleDto();
        dto.setName(name);
        dto.setEmail(email);
        dto.setAlterEmail(alterEmail);
        dto.setPhNo(phNo);
        dto.setAlterPhNo(alterPhNo);
        dto.setLocation(location);

       boolean updatedDetailsByName = service.UpdateDetailsByName(dto);
        if(updatedDetailsByName)
        {
            System.out.println("data updated successfully");
            model.addAttribute("detailUpdateMsg","Detail updated for "+dto.getName());
        }else System.out.println("Failed to Update");

        return "UpdateDetails";


    }
}





