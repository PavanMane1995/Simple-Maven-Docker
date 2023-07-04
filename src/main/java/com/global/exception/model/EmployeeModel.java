package com.global.exception.model;

import com.global.exception.entity.Employee;
import com.global.exception.exceptions.EmployeeException;
import lombok.Data;

@Data
public class EmployeeModel {

    private String name;
    private String dept;
    private float sal;

    public static EmployeeModel convertToModel(Employee employee) throws EmployeeException {
        EmployeeModel employeeModel = new EmployeeModel();
        employeeModel.setName(employee.getName());
        employeeModel.setDept(employee.getDept());
        employeeModel.setSal(employee.getSal());
        return employeeModel;
    }
}
