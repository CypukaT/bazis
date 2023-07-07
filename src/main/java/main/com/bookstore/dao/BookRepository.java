package com.bookstore.dao;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<com.bookstore.dao.BookEntity, Long> {
    List<com.bookstore.dao.BookEntity> findAllByAuthorContaining(String author);
    List<com.bookstore.dao.BookEntity> findAllByTitleContaining(String title);
}
