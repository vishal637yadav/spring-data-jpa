package com.sourcecode.springdatajpa.service;

import com.sourcecode.springdatajpa.dto.InputRequest;
import com.sourcecode.springdatajpa.model.Employee;
import com.sourcecode.springdatajpa.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    public String saveEmployee(InputRequest<Employee> request){
        System.out.println("requst::"+request);
        String currentUser = request.getLoggedInUser();
        System.out.println("--user---::"+currentUser);

        request.setTimeZone(Calendar.getInstance().getTimeZone().getDisplayName());
        Employee employee = request.getEmployee();
        System.out.println("employee::"+employee);
        employee.setCreatedBy(currentUser);
        System.out.println("After employee::"+employee);
        repository.save(employee);
        return "Employee Saved Successfully!!";
    }

    public String updateEmployee(int id,double salary, InputRequest<Employee> request){

        Optional<Employee> employeeOptional = repository.findById(id);

        if(employeeOptional.isPresent()){

            Employee employee = employeeOptional.get();
            employee.setLastModifiedBy(request.getLoggedInUser());
            employee.setSalary(salary);
            repository.saveAndFlush(employee);
        }else{
            throw new RuntimeException("Employee not found with id "+id);
        }

        return "Employee Updated Successfully!!";
    }

}
