package com.example.database.service.impl;


import com.example.database.Repositories.BookRepository;
import com.example.database.model.Book;
import com.example.database.service.BookService;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Collection<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Collection<Book> findAllBooksByAuthor(String author) {
        return bookRepository.findAllByAuthor(author);
    }
}
