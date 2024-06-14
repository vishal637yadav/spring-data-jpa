package com.sourcecode.springdatajpa.service;

import com.sourcecode.springdatajpa.dto.PostMessageDto;
import com.sourcecode.springdatajpa.model.PostMessage;
import com.sourcecode.springdatajpa.repository.EmployeeRepository;
import com.sourcecode.springdatajpa.repository.PostMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostMessageService {

    @Autowired
    private PostMessageRepository repository;

    public void savePost(PostMessageDto postMessageDto) throws Exception{
        PostMessage model = new PostMessage();
        model.setPostTitle(postMessageDto.getTitle());
        model.setPostContent(postMessageDto.getContent());
        repository.save(model);
    }



}
