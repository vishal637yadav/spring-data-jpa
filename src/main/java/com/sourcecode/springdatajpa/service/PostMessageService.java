package com.sourcecode.springdatajpa.service;

import com.sourcecode.springdatajpa.model.PostMessage;
import com.sourcecode.springdatajpa.repository.PostMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostMessageService {

    @Autowired
    private PostMessageRepository repository;

    public void savePost(PostMessage postMessage) throws Exception{
        repository.save(postMessage);
    }

    public List<PostMessage> getPostList()
    {
        return  repository.findAll();
    }

    public String updatePost(int postId, PostMessage requestPostMessageObject) {
        String responseMessage ="";

        System.out.println("-----requestPostMessageObject----\n"+requestPostMessageObject);
        
        PostMessage existingPostMessage = repository.findByPostId(postId);
        System.out.println("-----existingPostMessage----\n"+existingPostMessage);


        if(existingPostMessage != null){
            existingPostMessage.setTitle(requestPostMessageObject.getTitle());
            existingPostMessage.setContent(requestPostMessageObject.getContent());
            existingPostMessage.setGoc(requestPostMessageObject.getGoc());
            existingPostMessage.setActiveStatus(requestPostMessageObject.getActiveStatus());
            existingPostMessage.setApproveStatus(requestPostMessageObject.getApproveStatus());
            existingPostMessage.setReviewerComment(requestPostMessageObject.getReviewerComment());

            //Data Saved in Database
            repository.save(existingPostMessage);
            responseMessage = "Record Updated Successfully";
        }else{
            responseMessage = "Input postId='"+postId+"' do not exists in the DataBase So cannot be updated!!";
        }
        System.out.println("-----test--existingPostMessage--"+existingPostMessage);

        return responseMessage;
    }


}
