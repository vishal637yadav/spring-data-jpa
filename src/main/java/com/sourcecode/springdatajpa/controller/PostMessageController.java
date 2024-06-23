package com.sourcecode.springdatajpa.controller;

import com.sourcecode.springdatajpa.dto.InputRequest;
import com.sourcecode.springdatajpa.model.Employee;
import com.sourcecode.springdatajpa.model.PostMessage;
import com.sourcecode.springdatajpa.service.PostMessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class PostMessageController {

    @Autowired
    private PostMessageService service;

    @CrossOrigin(origins = "*", allowedHeaders = "*", methods = { RequestMethod.POST})
    @PostMapping("/save")
    public String savePostMessage(@RequestBody PostMessage request){
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

    @CrossOrigin(origins = "*", allowedHeaders = "*", methods = { RequestMethod.GET})
    @GetMapping("/getPostedMessagesList")
    public List<PostMessage> getPostedMessagesList(){
        System.out.println("------getPostedMessagesList-----called!!");
        List<PostMessage> list = service.getPostList();
        System.out.println("list----------::"+list);
        return list;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*", methods = { RequestMethod.PUT})
    @PutMapping("/update/{postId}")
    public String updatePostMessage(@PathVariable int postId, @RequestBody PostMessage request){


        return service.updatePost(postId,request);
    }

}
