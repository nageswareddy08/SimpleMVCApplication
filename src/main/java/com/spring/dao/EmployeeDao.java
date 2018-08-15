package com.spring.dao;

import com.spring.model.EmployeeVo;

import java.util.List;

/**
 * Created by Nageswar on 6/24/2018.
 */
public interface EmployeeDao {
    public List<EmployeeVo> getEmployeeDetails();
}
