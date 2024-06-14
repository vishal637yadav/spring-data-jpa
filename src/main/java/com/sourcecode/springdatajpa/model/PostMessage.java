package com.sourcecode.springdatajpa.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@ToString
@Data
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "POST_MESSAGE")
public class PostMessage {

    @Id
    @GeneratedValue
    private int postId;
    private String postTitle;
    private String postContent;


    @CreatedDate
    private Date createdDate;
    @LastModifiedDate
    private Date lastModifiedData;
    @CreatedBy
    private String createdBy;
    @LastModifiedBy
    private String lastModifiedBy;

}
