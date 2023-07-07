package main.com.bookstore.mapper;

import main.com.bookstore.dao.BookEntity;
import main.com.bookstore.model.Book;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookToEntityMapper {
    BookEntity bookToBookEntity(Book book);
    Book bookEntityToBook(BookEntity bookEntity);
}