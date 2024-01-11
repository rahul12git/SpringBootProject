package com.example.springboot.service;

import com.example.springboot.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {

   public Employee saveEmployee(Employee employee);


   public List<Employee> getAllEmployee();


public Employee getEmployeeById(Long id);

public Employee deleteEmployeeById(Long id);

public Employee getEmployeeDetailsByName(String name);

public Employee updateEmployeeById(Employee emp);

}
