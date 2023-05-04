package com.example.demo.controller;

import java.util.List;

import com.example.demo.model.Message;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {
	
    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public ModelAndView openHome() {
       ModelAndView model = new ModelAndView("home");
       
       return model;
    }
}
