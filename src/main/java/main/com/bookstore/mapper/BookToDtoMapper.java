package main.com.bookstore.mapper;

import main.com.bookstore.model.Book;
import main.com.bookstore.model.BookRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookToDtoMapper {
    Book AddBookRequestToBook(BookRequest bookRequest);
    Book EditBookRequestToBook(Long id, BookRequest bookRequest);
}
