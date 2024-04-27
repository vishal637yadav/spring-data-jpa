package com.sourcecode.springdatajpa.repository;

import com.sourcecode.springdatajpa.model.BookInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.history.RevisionRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookInfoRepo extends JpaRepository<BookInfo,Integer> {

}
