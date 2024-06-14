package com.sourcecode.springdatajpa.controller;

import com.sourcecode.springdatajpa.dto.PostMessageDto;
import com.sourcecode.springdatajpa.service.PostMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class PostMessageController {

    @Autowired
    private PostMessageService service;

    @CrossOrigin(origins = "*", allowedHeaders = "*", methods = { RequestMethod.POST})
    @PostMapping("/save")
    public String savePostMessage(@RequestBody PostMessageDto request){
        System.out.println("------Input Request-----");
        System.out.println(request);

        String responseMessage ;
        try {
            service.savePost(request);
            responseMessage = "Message Successfully Save to Database !!";
        } catch (Exception e) {
            responseMessage = "Exception Occured ::"+e.getMessage();
        }
        return responseMessage;
    }

}
