package com.example.demo.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
//
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HelloController {
    @GetMapping("/hello")
//    public String index() {
//        return "index";
//    }
    public String index(ModelMap modelMap){
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd EEEEEEE" , Locale.ENGLISH);
    	modelMap.addAttribute("message", sdf.format(d));
		return "index";
    }
}
