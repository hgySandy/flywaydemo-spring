package com.lance.flywaydemo.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {
    @RequestMapping(value="/", method=RequestMethod.GET)
    public final String wrapperGet(){
        return "wrapper";
    }
    
    @RequestMapping(value="/Home", method=RequestMethod.GET)
    public final String homeGet(){
        return "home";
    }
    
    @RequestMapping(value="/Details", method=RequestMethod.GET)
    public final String detailsGet(){
        return "details";
    }    
    
    @RequestMapping(value="/Error", method=RequestMethod.GET)
    public final ModelAndView RequestErrorHandler(HttpServletRequest request, HttpServletResponse response){
        return new ModelAndView("redirect:/");
    }        
}
