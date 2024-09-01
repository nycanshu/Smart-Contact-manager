package com.scm.Smart.Contact.manager.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model) {
        // sending data to html page
        return "home";
    }

    @RequestMapping("/about")
    public String aboutPage() {
        // sending data to html page
        return "about";
    }

    @RequestMapping("/services")
    public String servicePage() {
        // sending data to html page
        return "services";
    }

    @GetMapping("/contact")
    public String contact() {
        return new String("contact");
    }
    
    @GetMapping("/login")
    public String login() {
        return new String("login");
    }
    
    @GetMapping("/register")
    public String register() {
        return new String("register");
    }
    


}
