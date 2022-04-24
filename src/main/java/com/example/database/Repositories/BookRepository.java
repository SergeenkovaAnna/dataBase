package com.example.database.Repositories;

import com.example.database.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface BookRepository extends JpaRepository<Book, Integer> {

    Collection<Book> findAllByAuthor(String author);

}
