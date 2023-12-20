package com.gera.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class MultiplyController {
    @RequestMapping("multiply")
    public String multiply()

    {
//		int i=Integer.parseInt(request.getParameter("var1"));
//		int j=Integer.parseInt(request.getParameter("var2"));


        //Keep Controllers Away from Business Logics
//        MultiplyService ser=new MultiplyService();
//        int res=ser.multi(i, j);
//        System.out.println(i+" "+j);
//        ModelAndView mv = new ModelAndView();
//        mv.setViewName("multiply");
//        mv.addObject("result", res);
        return "index2";
    }


}
