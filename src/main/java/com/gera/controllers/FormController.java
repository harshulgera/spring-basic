package com.gera.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/form")
public class FormController {

    @RequestMapping("/")
    public String formProcess()
    {
//        System.out.println(fname+" "+lname);
        return "index";
    }
}
