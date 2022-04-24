package com.example.database.service;

import com.example.database.model.Book;

import java.util.Collection;

public interface BookService {

    Book addBook(Book book);

    Collection<Book> getAllBooks();

    Collection<Book> findAllBooksByAuthor(String author);

}
