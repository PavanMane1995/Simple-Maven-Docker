package com.global.exception.entity;

import com.global.exception.model.EmployeeModel;
import lombok.Data;

import javax.persistence.*;
import java.math.BigInteger;

@Data
@Entity
public class Employee {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column
    private String name;

    @Column
    private String dept;

    @Column(name = "salary")
    private float sal;


    public static Employee convertToEntity(EmployeeModel employeeModel) {
        Employee employee = new Employee();
        employee.setName(employeeModel.getName());
        employee.setDept(employeeModel.getDept());
        employee.setSal(employeeModel.getSal());
        return employee;
    }
}
