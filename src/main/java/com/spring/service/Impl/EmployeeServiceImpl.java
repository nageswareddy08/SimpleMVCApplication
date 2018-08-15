package com.spring.service.Impl;

import com.spring.dao.EmployeeDao;
import com.spring.model.EmployeeVo;
import com.spring.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Nageswar on 6/24/2018.
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDao employeeDao;
    @Override
    public List<EmployeeVo> getEmployeeDetails() {
        return employeeDao.getEmployeeDetails();
    }
}
