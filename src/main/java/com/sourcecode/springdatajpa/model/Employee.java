package com.sourcecode.springdatajpa.model;


import com.fasterxml.jackson.annotation.JsonFormat;
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
@Table(name = "SPRING_AUDI_TB")
public class Employee {

    @Id
    @GeneratedValue
    private int id;
    private String name;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM/dd/yyyy")
    private Date doj;

    private String dept;
    private double salary;


    @CreatedDate
    private Date createdDate;
    @LastModifiedDate
    private Date lastModifiedData;
    @CreatedBy
    private String createdBy;

    @LastModifiedBy
    private String lastModifiedBy;

}
