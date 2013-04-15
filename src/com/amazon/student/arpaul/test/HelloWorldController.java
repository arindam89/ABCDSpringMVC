package com.amazon.student.arpaul.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.github.jknack.handlebars.Handlebars;

 
@Controller
public class HelloWorldController {
 
    @RequestMapping("/hello")
    public String helloWorld() {
 
        String message = "Hello World, Spring 3.0!";
        return "hello";
        //return "hello";
    }
}
