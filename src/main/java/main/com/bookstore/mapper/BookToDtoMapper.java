package com.bookstore.mapper;

import com.bookstore.model.Book;
import com.bookstore.model.BookRequest;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookToDtoMapper {
    Book AddBookRequestToBook(BookRequest bookRequest);
    Book EditBookRequestToBook(Long id, BookRequest bookRequest);
}
