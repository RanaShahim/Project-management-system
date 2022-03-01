package com.example.demo.com.jrp.pma.dao;

import com.example.demo.com.jrp.pma.entities.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepo extends CrudRepository<Employee, Long> {

    List<Employee> findAll();
}
