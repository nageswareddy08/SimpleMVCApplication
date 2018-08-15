package com.spring.controller;

import com.spring.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.spring.model.EmployeeVo;

import java.util.List;

/**
 * Created by Nageswar on 6/24/2018.
 */
@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/employeeDetails")
    public ModelAndView getEmployeeDetails() {
        ModelAndView modelAndView = new ModelAndView("employeeListDisplay");
        List<EmployeeVo> employeeVoList = employeeService.getEmployeeDetails();
        modelAndView.addObject("employees", employeeVoList);
        return modelAndView;
    }
}
