package com.gera.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class DisplayController
{
    @RequestMapping("/")
    public String home()
    {
        return "index";
    }

    @RequestMapping("display")
    public  String displayForm(@RequestParam("fname") String name,@RequestParam("lname") String lname)
    {
        System.out.println(name+" "+lname);
        return "index2";
    }

}
