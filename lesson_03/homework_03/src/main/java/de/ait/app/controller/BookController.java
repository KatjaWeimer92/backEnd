package de.ait.app.controller;

import de.ait.app.entity.Book;
import de.ait.app.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class BookController {

    @Autowired
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }
    public Book getBookById(long id) {
        return bookService.getBookById(id);
    }
}
