package com.bridgelabz.EmployeePayrollApp.model;


import com.bridgelabz.EmployeePayrollApp.DTO.EmployeeDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "employee")
public class EmployeeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private double salary;


    public EmployeeModel(){}
    public EmployeeModel( EmployeeDTO employeeDTO) {
        this.name =employeeDTO.getName();
        this.salary = employeeDTO.getSalary();
    }

}