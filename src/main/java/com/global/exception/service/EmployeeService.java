package com.global.exception.service;

import com.global.exception.exceptions.EmployeeException;
import com.global.exception.model.EmployeeModel;

public interface EmployeeService {

    EmployeeModel getEmployee(Long id) throws EmployeeException;
    Long saveEmployee(EmployeeModel e);

}
