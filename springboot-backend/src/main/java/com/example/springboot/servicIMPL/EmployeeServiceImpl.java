package com.example.springboot.servicIMPL;

import com.example.springboot.model.Employee;
import com.example.springboot.repository.EmployeeRepository;
import com.example.springboot.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {


    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee saveEmployee(Employee employee) {

      Employee employee1=  employeeRepository.save(employee);

        return employee1 ;
    }

    @Override
    public List<Employee> getAllEmployee() {
       List<Employee> employeeList = (List<Employee>) employeeRepository.findAll();

        return employeeList;
    }

    @Override
    public Employee getEmployeeById(Long id) {
        Optional<Employee> employee =employeeRepository.findById(id);
       Employee employee1= employee.get();
        return employee1 ;
    }

    @Override
    public Employee deleteEmployeeById(Long id) {
//        Optional<Employee> employeeOptional  = employeeRepository.findById(id);
//
//       Employee employee =employeeOptional.get();

        Employee employee=getEmployeeById(id);

        employeeRepository.deleteById(id);

        return employee;
    }

    @Override
    public Employee getEmployeeDetailsByName(String name) {

     //   Employee employee=employeeRepository.findByName(name);

      //  return employee;

        return new Employee();
    }

    @Override
    public Employee updateEmployeeById(Employee emp) {



        return null;
    }
}
