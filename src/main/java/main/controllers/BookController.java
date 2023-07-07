package main.controllers;

import lombok.RequiredArgsConstructor;
import main.com.bookstore.mapper.BookToDtoMapper;
import main.com.bookstore.model.Book;
import main.com.bookstore.model.BookRequest;
import main.com.bookstore.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("/books")
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;
    private final BookToDtoMapper mapper;

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {
        return bookService.getBookById(id);
    }

    @GetMapping
    public List<Book> getAllBooks(@RequestParam(required = false) String author) {
        if (author != null)
            return bookService.findByAuthor(author);

        return bookService.getAllBooks();
    }

    @PostMapping
    public void addBook(@RequestBody BookRequest request) {
        bookService.addBook(mapper.AddBookRequestToBook(request));
    }

    @PutMapping("/{id}")
    public void editBook(@PathVariable Long id, @RequestBody BookRequest request) {
        bookService.editBook(mapper.EditBookRequestToBook(id, request));
    }
}
