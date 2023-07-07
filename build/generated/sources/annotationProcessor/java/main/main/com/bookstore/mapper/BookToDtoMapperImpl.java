package main.com.bookstore.mapper;

import javax.annotation.processing.Generated;
import main.com.bookstore.model.Book;
import main.com.bookstore.model.BookRequest;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-07T23:55:48+0300",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.jar, environment: Java 17.0.7 (Eclipse Adoptium)"
)
@Component
public class BookToDtoMapperImpl implements BookToDtoMapper {

    @Override
    public Book AddBookRequestToBook(BookRequest bookRequest) {
        if ( bookRequest == null ) {
            return null;
        }

        String author = null;
        String title = null;
        Double price = null;

        author = bookRequest.getAuthor();
        title = bookRequest.getTitle();
        price = bookRequest.getPrice();

        Long id = null;

        Book book = new Book( id, author, title, price );

        return book;
    }

    @Override
    public Book EditBookRequestToBook(Long id, BookRequest bookRequest) {
        if ( id == null && bookRequest == null ) {
            return null;
        }

        String author = null;
        String title = null;
        Double price = null;
        if ( bookRequest != null ) {
            author = bookRequest.getAuthor();
            title = bookRequest.getTitle();
            price = bookRequest.getPrice();
        }
        Long id1 = null;
        id1 = id;

        Book book = new Book( id1, author, title, price );

        return book;
    }
}
