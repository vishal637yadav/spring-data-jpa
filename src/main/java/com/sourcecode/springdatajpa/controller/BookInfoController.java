package com.sourcecode.springdatajpa.controller;

import com.sourcecode.springdatajpa.dto.InputRequest;
import com.sourcecode.springdatajpa.model.BookInfo;
import com.sourcecode.springdatajpa.model.Employee;
import com.sourcecode.springdatajpa.repository.BookInfoRepo;
import com.sourcecode.springdatajpa.service.BookInfoService;
import com.sourcecode.springdatajpa.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookInfoController {

    @Autowired
    BookInfoService bookInfoService;

    @PostMapping("/addBookInfo")
    public String saveEmployee(@RequestBody InputRequest<BookInfo> request){


        return bookInfoService.saveBookInfo(request);

    }

    @PutMapping("/updateBookInfo/{id}")
    public String updateEmployee(@PathVariable int id, @RequestBody InputRequest<BookInfo> request){
        return bookInfoService.updateBookInfo(id,request);
    }

}
