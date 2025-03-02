package com.bridgelabz.EmployeePayrollApp.model;



import com.bridgelabz.EmployeePayrollApp.DTO.EmployeeDTO;
import jakarta.persistence.*;

@Entity
@Table(name = "employee")
public class EmployeeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double salary;


    public EmployeeModel( EmployeeDTO employeePayrollDTO) {
        this.name = employeePayrollDTO.getName();
        this.salary = employeePayrollDTO.getSalary();
    }

    public EmployeeModel( String name, int salary) {
        this.name = name;
        this.salary = salary;
    }


    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}