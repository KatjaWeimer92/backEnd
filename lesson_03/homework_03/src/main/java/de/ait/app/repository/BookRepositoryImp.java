package de.ait.app.repository;

import de.ait.app.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Component
public class BookRepositoryImp implements BookRepository {

    List<Book> db = List.of(
            new Book(1L, "To Kill a Mockingbird", "Harper Lee", 1960, new BigDecimal("19.90")),
            new Book(2L, "1984", "George Orwell", 1949, new BigDecimal("29.90")),
            new Book(3L, "Pride and Prejudice", "Jane Austen", 1813, new BigDecimal("9.90")),
            new Book(4L, "The Catcher in the Rye", "J.D. Salinger", 1951, new BigDecimal("39.90")),
            new Book(5L, "The Great Gatsby", "F. Scott Fitzgerald", 1925, new BigDecimal("19.90")),
            new Book(6L, "Moby-Dick", "Herman Melville", 1851, new BigDecimal("10.90")),
            new Book(7L, "The Lord of the Rings", "J.R.R. Tolkien", 1954, new BigDecimal("14.90")),
            new Book(8L, "The Hobbit", "J.R.R. Tolkien", 1937, new BigDecimal("18.90")),
            new Book(9L, "Jane Eyre", "Charlotte Bronte", 1847, new BigDecimal("49.90")),
            new Book(10L, "The Road", "Cormac McCarthy", 2006, new BigDecimal("9.90"))
    );

    @Override
    public List<Book> findAll() {
        return db;
    }

    @Override
    public Book findById(Long id) {
        return null;
    }

    @Override
    public Book save(Book book) {
        return null;
    }

    @Override
    public Book delete(Book book) {
        return null;
    }
}
