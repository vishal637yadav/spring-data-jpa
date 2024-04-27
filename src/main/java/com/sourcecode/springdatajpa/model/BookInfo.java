package com.sourcecode.springdatajpa.model;

import com.sourcecode.springdatajpa.model.audit.Auditable;
import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@ToString
@Table(name = "BOOK_INFO")
@Entity
public class BookInfo extends Auditable
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String authors;
    private int totalPageCount;

}
