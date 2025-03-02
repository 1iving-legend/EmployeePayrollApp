package com.bridgelabz.EmployeePayrollApp.service;

import com.bridgelabz.EmployeePayrollApp.DTO.EmployeeDTO;
import com.bridgelabz.EmployeePayrollApp.model.EmployeeModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServices {

    //Add employee to the list
    List<EmployeeModel> employeeList = new ArrayList<>();
    public EmployeeModel createEmployee(EmployeeDTO employeeDTO){
        EmployeeModel employee = new EmployeeModel(employeeDTO);
        employeeList.add(employee);
        return employee;
    }
    //list of all the employee
    public List<EmployeeModel> getAllEmployees(){
        return employeeList;
    }
    // Update Employee
    public EmployeeModel updateEmployee(String name, EmployeeDTO employeeDTO) {
        for (EmployeeModel employee : employeeList) {
            if (employee.getName().equalsIgnoreCase(name)) {
                employee.setName(employeeDTO.getName());
                employee.setSalary(employeeDTO.getSalary());
                return employee;
            }
        }
        return null;
    }
    // Delete Employee
    public boolean deleteEmployee(String name) {
        return employeeList.removeIf(emp -> emp.getName().equalsIgnoreCase(name));
    }
}