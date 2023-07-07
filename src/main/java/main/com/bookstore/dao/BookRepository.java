package main.com.bookstore.dao;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<BookEntity, Long> {
    List<BookEntity> findAllByAuthorContaining(String author);
    List<BookEntity> findAllByTitleContaining(String title);
}
