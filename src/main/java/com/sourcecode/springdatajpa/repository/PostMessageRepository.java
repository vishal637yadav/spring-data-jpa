package com.sourcecode.springdatajpa.repository;

import com.sourcecode.springdatajpa.model.PostMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PostMessageRepository extends JpaRepository<PostMessage,Integer> {

    public PostMessage findByPostId(int postId);

}

