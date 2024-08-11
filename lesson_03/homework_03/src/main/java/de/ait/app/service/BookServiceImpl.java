package de.ait.app.service;

import de.ait.app.entity.Book;
import de.ait.app.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookServiceImpl implements BookService {

    @Autowired
    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBookById(Long id) {
        return bookRepository.findAll()
                .stream()
                .filter(p->p.getId().equals(id))
                .findAny()
                .get();
    }

    @Override
    public Book saveBook(Book book) {
        return null;
    }

    @Override
    public void deleteBook(Long id) {

    }
}
