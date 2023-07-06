package main.com.bookstore.mapper;

import javax.annotation.processing.Generated;
import main.com.bookstore.dao.BookEntity;
import main.com.bookstore.model.Book;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-06T16:58:23+0300",
    comments = "version: 1.5.3.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.jar, environment: Java 17.0.7 (Eclipse Adoptium)"
)
@Component
public class BookToEntityMapperImpl implements BookToEntityMapper {

    @Override
    public BookEntity bookToBookEntity(Book book) {
        if ( book == null ) {
            return null;
        }

        BookEntity bookEntity = new BookEntity();

        bookEntity.setId( book.getId() );
        bookEntity.setAuthor( book.getAuthor() );
        bookEntity.setTitle( book.getTitle() );
        bookEntity.setPrice( book.getPrice() );

        return bookEntity;
    }

    @Override
    public Book bookEntityToBook(BookEntity bookEntity) {
        if ( bookEntity == null ) {
            return null;
        }

        Long id = null;
        String author = null;
        String title = null;
        Double price = null;

        id = bookEntity.getId();
        author = bookEntity.getAuthor();
        title = bookEntity.getTitle();
        price = bookEntity.getPrice();

        Book book = new Book( id, author, title, price );

        return book;
    }
}
