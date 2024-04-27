package com.sourcecode.springdatajpa.controller;

import com.sourcecode.springdatajpa.dto.InputRequest;
import com.sourcecode.springdatajpa.model.Employee;
import com.sourcecode.springdatajpa.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping("/addEmployee")
    public String saveEmployee(@RequestBody InputRequest<Employee> request){
        return service.saveEmployee(request);
    }

    @PutMapping("/updateEmployee/{id}/{salary}")
    public String updateEmployee(@PathVariable int id, @PathVariable double salary, @RequestBody InputRequest<Employee> request){
        return service.updateEmployee(id,salary,request);
    }
}
