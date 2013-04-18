package com.amazon.student.arpaul.test;

import java.io.IOException;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

 
@Controller
public class HelloWorldController {
    @RequestMapping("/hello")
    public void helloWorld(Model model) throws IOException {
    	model.addAttribute("name", HelloWorldController.class.getSimpleName());
    }
}
