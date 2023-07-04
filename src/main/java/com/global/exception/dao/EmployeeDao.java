package com.global.exception.dao;

import com.global.exception.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Long> {

    Employee save(Employee e);

    Employee findEmployeeById(Long id);
}
