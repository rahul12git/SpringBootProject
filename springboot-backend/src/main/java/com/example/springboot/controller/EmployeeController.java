package com.example.springboot.controller;

import com.example.springboot.model.Employee;
import com.example.springboot.repository.EmployeeRepository;
import com.example.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {


    @Autowired
    private EmployeeService employeeService;

    //get All Employees
    @GetMapping("/employees")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployee();
    }

    @PostMapping("/postEmployees")
    private Employee saveEmployee(@RequestBody Employee employee) {
        Employee employee1 = employeeService.saveEmployee(employee);
        return employee1;
    }

    @GetMapping("/employee/{id}")
    private Employee getEmployee(@PathVariable("id") long id) {
        Employee employee1 = employeeService.getEmployeeById(id);
        return employee1;
    }

    @DeleteMapping("/deleteEmployee/{id}")
    private Employee deleteEmployeeById(@PathVariable("id") long id) {
        Employee employee = employeeService.deleteEmployeeById(id);
        return employee;
    }


}
