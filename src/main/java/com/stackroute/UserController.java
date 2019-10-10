package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UserController {
    @RequestMapping("/add")
    public /*String*/ModelAndView user(HttpServletRequest request, HttpServletResponse response)
    {/*
        int i=Integer.parseInt(request.getParameter("t1"));
        int j=Integer.parseInt(request.getParameter("t2"));*/

        String name=request.getParameter("MyName");
        //creating model object to pass the value
        ModelAndView modelAndView=new ModelAndView();
        //which view i want to call
        modelAndView.setViewName("Display.jsp");
        //what object i want to pass
        modelAndView.addObject("username",name);
        //return "Display.jsp";
        return modelAndView;
    }
}
