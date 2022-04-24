package com.example.database.controllers;

import com.example.database.model.Book;
import com.example.database.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("book")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return  bookService.addBook(book);
    }

    @GetMapping("/getAllBooks")
    public ResponseEntity<Collection<Book>> getAllBooks() {
        return ResponseEntity.ok(bookService.getAllBooks());
    }

    @GetMapping("/getAllBooksByAuthor")
    public ResponseEntity<Collection<Book>> getAllBooksByAuthor(@RequestParam String author) {
        return  ResponseEntity.ok(bookService.findAllBooksByAuthor(author));
    }

}
