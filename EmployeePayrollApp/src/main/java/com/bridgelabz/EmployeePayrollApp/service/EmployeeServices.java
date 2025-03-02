package com.bridgelabz.EmployeePayrollApp.service;


import com.bridgelabz.EmployeePayrollApp.model.EmployeeModel;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServices {

    public EmployeeModel createEmployee(String name, int salary){
        return new EmployeeModel(name,salary);
    }
}