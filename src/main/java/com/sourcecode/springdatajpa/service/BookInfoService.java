package com.sourcecode.springdatajpa.service;

import com.sourcecode.springdatajpa.dto.InputRequest;
import com.sourcecode.springdatajpa.model.BookInfo;
import com.sourcecode.springdatajpa.model.Employee;
import com.sourcecode.springdatajpa.repository.BookInfoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Optional;

@Service
public class BookInfoService {

    @Autowired
    private BookInfoRepo repository;

    public String saveBookInfo(InputRequest<BookInfo> request){
        System.out.println("requst::"+request);
        request.setTimeZone(Calendar.getInstance().getTimeZone().getDisplayName());
        BookInfo bookInfo = request.getEmployee();
        System.out.println("bookInfo::"+bookInfo);
        repository.save(bookInfo);
        return "BookInfo Saved Successfully!!";
    }


    public String updateBookInfo(int id, InputRequest<BookInfo> request){

        Optional<BookInfo> bookInfoOptional = repository.findById(id);
        BookInfo requestBookInfo = request.getEmployee();
        System.out.println("requestBookInfo ::-->>"+requestBookInfo);

        if(bookInfoOptional.isPresent()){

            BookInfo bookInfo = bookInfoOptional.get();
            bookInfo.setLastModifiedBy(request.getLoggedInUser());
            bookInfo.setTotalPageCount(requestBookInfo.getTotalPageCount());
            bookInfo.setAuthors(requestBookInfo.getAuthors());
            bookInfo.setName(requestBookInfo.getName());

            repository.saveAndFlush(bookInfo);
        }else{
            throw new RuntimeException("BookInfo not found with id "+id);
        }

        return "BookInfo Updated Successfully!!";
    }

}
