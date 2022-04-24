package com.example.database.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.Objects;

@Entity
public class Book {
    
    private String name;
    @Id
    @GeneratedValue
    private Integer bookId;

    @ManyToOne
    private Author author;

    public Book(String name, Integer bookId) {
        this.name = name;
        this.bookId = bookId;
    }

    public Book() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book author = (Book) o;
        return Objects.equals(name, author.name) && Objects.equals(bookId, author.bookId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, bookId);
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", bookId=" + bookId +
                '}';
    }
}
