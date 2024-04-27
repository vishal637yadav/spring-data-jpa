package com.sourcecode.springdatajpa.repository;

import com.sourcecode.springdatajpa.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {



}
