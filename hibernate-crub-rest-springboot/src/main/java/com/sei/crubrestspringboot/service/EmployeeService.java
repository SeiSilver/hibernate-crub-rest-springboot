package com.sei.crubrestspringboot.service;

import com.sei.crubrestspringboot.dao.EmployeeDAO;
import com.sei.crubrestspringboot.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeService {

    public List<Employee> findAll();

    public Employee findById(int theId);

    public void save(Employee theEmployee);

    public void deleteById(int theId);

}
