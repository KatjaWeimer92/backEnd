package de.ait.app.service;

import de.ait.app.entity.Book;

import java.util.List;

public interface BookService {

    List<Book> getAllBooks();
    Book getBookById(Long id);
    Book saveBook(Book book);
    void deleteBook(Long id);
}
