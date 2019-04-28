package com.example.controller;
import java.util.Locale;
//import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FirstController {

    @RequestMapping("/hello")
    public String hello(Locale locale, Model mode)
    {
        return "Hello World!";
    }
}
