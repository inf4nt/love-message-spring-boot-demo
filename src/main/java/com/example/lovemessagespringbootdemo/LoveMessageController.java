package com.example.lovemessagespringbootdemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class LoveMessageController {

    @Value("${love.name:Lele}")
    private String loveName;

    @GetMapping
    public ModelAndView root() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("root");
        modelAndView.addObject("loveName", loveName);
        return modelAndView;
    }

    @GetMapping("/index")
    public ModelAndView index() {
        return root();
    }
}
