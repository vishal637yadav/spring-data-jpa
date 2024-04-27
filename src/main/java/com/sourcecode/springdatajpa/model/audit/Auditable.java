package com.sourcecode.springdatajpa.model.audit;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.util.Date;

@Getter
@Setter
//MappedSuperclass : this class is only super class of any jpa entity, not a jpa entity class.
@MappedSuperclass
//To capture Auditing Events
@EntityListeners(AuditingEntityListener.class)
public class Auditable {

    @CreatedBy
    @Column(nullable = false,updatable = false)
    protected String createdBy;

    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    @Column(nullable = false,updatable = false)
    protected Date createdDate;

    @LastModifiedBy
    @Column(insertable = false)
    protected String lastModifiedBy;

    @Temporal(TemporalType.TIMESTAMP)
    @LastModifiedDate
    @Column(insertable = false)
    protected Date lastModifiedDate;

}
