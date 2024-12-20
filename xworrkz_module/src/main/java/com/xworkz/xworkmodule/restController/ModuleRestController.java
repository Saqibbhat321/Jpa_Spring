package com.xworkz.xworkmodule.restController;

import com.xworkz.xworkmodule.repository.ModuleRepo;
import com.xworkz.xworkmodule.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ModuleRestController {
    @Autowired
    private ModuleService service;

    public ModuleRestController()
    {
        System.out.println("rest controller to chal raha hai");
    }
    @GetMapping(value = "/name/{name}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String onName(@PathVariable String name) {
        System.out.println("name=" + name);
        Long count = this.service.countName(name);
        if (count == 0) {
            return "";
        } else {
            return "Name exists";
        }

    }

    @GetMapping(value = "/emailValue/{email}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String onEmail(@PathVariable String email) {
        System.out.println("email=" + email);
        Long count = this.service.countByEmail(email);
        String msg="";
        if (count == 0) {
           msg ="";
        } else {
            msg ="Email exists";
        }
        return msg;
    }


    @GetMapping(value = "/altEmail/{alterEmail}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String onAltEmail(@PathVariable String altEmail) {
        System.out.println("alterEmail=" + altEmail);
        Long count = this.service.countByAltEmail(altEmail);
        if (count == 0) {
            return "";
        } else {
            return "Alternate email exists";
        }
    }

    @GetMapping(value = "/phone/{phone}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String onPhone(@PathVariable String phone) {
        System.out.println("phNo=" + phone);
        Long count = this.service.countByPhone(phone);
        if (count == 0) {
            return "";
        } else {
            return "phone number exists";
        }
    }

    @GetMapping(value = "/altPhone/{altPhone}", produces = MediaType.APPLICATION_JSON_VALUE)
    public String onAltPhone(@PathVariable String altPhone) {
        System.out.println("alterPhNo=" + altPhone);
        Long count = this.service.countByAltPhone(altPhone);
        if (count == 0) {
            return "";
        } else {
            return "alter phone number exists";
        }
    }
}
