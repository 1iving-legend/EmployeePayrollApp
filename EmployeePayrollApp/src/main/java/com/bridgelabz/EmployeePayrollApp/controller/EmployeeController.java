package com.bridgelabz.EmployeePayrollApp.controller;

import com.bridgelabz.EmployeePayrollApp.model.EmployeeModel;
import com.bridgelabz.EmployeePayrollApp.service.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private EmployeeServices employeeService;


    @GetMapping("/get/{id}")
    public String getEmployeeById(@PathVariable Long id) {
        return "Fetching employee with ID: " + id;
    }

    @PostMapping("/create")
    public EmployeeModel createEmployee(@RequestParam String name, @RequestParam int salary) {
        return employeeService.createEmployee(name, salary);
    }


    @PutMapping("/update/{id}")
    public String updateEmployee(@PathVariable Long id) {
        return "Updating employee with ID: " + id;
    }

    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable Long id) {
        return "Deleting employee with ID: " + id;
    }

    @GetMapping("/DTO/get/{name}/{salary}")
    public EmployeeModel getEmployee(@PathVariable String name, @PathVariable int salary) {
        return new EmployeeModel(name,salary); // Returning employee details based on input
    }


    @GetMapping("/all")
    public List<EmployeeModel> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
}