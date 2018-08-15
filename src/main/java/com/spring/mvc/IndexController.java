package com.spring.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.method.support.ModelAndViewContainer;

/**
 * Created by Nageswar on 8/15/2018.
 */
@Controller
public class IndexController {
    @GetMapping(value = "/index")
    public ModelAndViewContainer index() {
        ModelAndViewContainer modelAndViewContainer = new ModelAndViewContainer();
        modelAndViewContainer.setViewName("hello.jsp");
        modelAndViewContainer.addAttribute("someAttribute", "someValue");
        return modelAndViewContainer;
    }
}
