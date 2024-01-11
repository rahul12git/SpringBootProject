package com.example.springboot.model;

public class TestEmp {
    public static void main(String[] args) {
        Employee emp= new Employee();
        emp.setId(1);
        emp.setFirstName("Rahul");
        emp.setLastName("Yadav");
        emp.setEmailId("rahulyadav48187@gmail.com");

        System.out.println(emp);
    }
}
