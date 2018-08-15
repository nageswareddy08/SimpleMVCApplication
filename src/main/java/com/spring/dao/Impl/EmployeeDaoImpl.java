package com.spring.dao.Impl;

import com.spring.dao.EmployeeDao;
import com.spring.model.EmployeeVo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nageswar on 6/24/2018.
 */
@Repository
public class EmployeeDaoImpl implements EmployeeDao{

    @Override
    public List<EmployeeVo> getEmployeeDetails() {
        EmployeeVo employeeVo = new EmployeeVo();
        EmployeeVo employeeVoTwo = new EmployeeVo();
        List<EmployeeVo> employeeVoList = new ArrayList<>();
        employeeVo.setFirstName("Nageswar");
        employeeVo.setId(101);
        employeeVo.setLastName("Reddy");
        employeeVoTwo.setId(102);
        employeeVoTwo.setFirstName("Yannam");
        employeeVoTwo.setLastName("Reddy");
        employeeVoList.add(employeeVo);
        employeeVoList.add(employeeVoTwo);
        return employeeVoList;
    }
}
