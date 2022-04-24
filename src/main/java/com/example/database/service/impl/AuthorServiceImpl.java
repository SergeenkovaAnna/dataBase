package com.example.database.service.impl;


import com.example.database.Repositories.AuthorRepository;
import com.example.database.model.Author;
import com.example.database.service.AuthorService;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }

    @Override
    public Author addAuthor(Author author) {
        return authorRepository.save(author);
    }
}
