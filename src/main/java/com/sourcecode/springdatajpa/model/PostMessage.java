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
    @Column(name = "POST_TITLE")
    private String title;
    @Column(name ="POST_CONTENT")
    private String content;

    private String goc;
    private String legalEntity;
    private String activeStatus;
    private String approveStatus;
    private String reviewerComment;

    @CreatedDate
    private Date createdDate;
    @LastModifiedDate
    private Date lastModifiedData;
    @CreatedBy
    private String createdBy;
    @LastModifiedBy
    private String lastModifiedBy;

}
