package com.global.exception.controller;

import com.global.exception.exceptions.EmployeeException;
import com.global.exception.model.EmployeeModel;
import com.global.exception.service.EmployeeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {
     private static final Logger log = LoggerFactory.getLogger(EmployeeController.class);

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value = "/get/{id}", produces = "application/json")
    public EmployeeModel getEmployee(@PathVariable("id") Long id) throws EmployeeException {
        log.info("Get call");
        return employeeService.getEmployee(id);
    }

    @PostMapping(value = "/save")
    public Long saveEmployee(@RequestBody EmployeeModel model){
        return employeeService.saveEmployee(model);
    }


}
