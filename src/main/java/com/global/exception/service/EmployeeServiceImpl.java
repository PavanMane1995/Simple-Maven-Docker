package com.global.exception.service;

import com.global.exception.dao.EmployeeDao;
import com.global.exception.exceptions.EmployeeException;
import com.global.exception.model.EmployeeModel;
import com.global.exception.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public EmployeeModel getEmployee(Long id)throws EmployeeException {
        Employee e =  employeeDao.findEmployeeById(id);
        try {
            return EmployeeModel.convertToModel(e);
        }catch (NullPointerException npe){
            throw new EmployeeException(npe.getMessage());
        }
    }

    @Override
    public Long saveEmployee(EmployeeModel e) {
       Employee employee =  employeeDao.save(Employee.convertToEntity(e));
        return employee.getId();
    }

}
