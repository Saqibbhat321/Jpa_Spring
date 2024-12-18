package com.xworkz.courseregistration.controller;

import com.xworkz.courseregistration.dto.CourseDto;
import com.xworkz.courseregistration.repository.CourseRepository;
import com.xworkz.courseregistration.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

@Controller
@RequestMapping("/")
public class CourseController {

    @Autowired
    CourseService service;
    @PostMapping("/register")
    public String onRegister(CourseDto dto, Model model)
    {

       String msg =service.save(dto);
        System.out.println("Controller "+msg);
       model.addAttribute("hello",msg);

        return "signup";
    }

    @PostMapping("/search")
    public String onSearch(@RequestParam String email, @RequestParam String password,Model model)
    {
        String valid = service.getName(email,password);
        model.addAttribute("nam",valid);

        return "login";
    }
}
