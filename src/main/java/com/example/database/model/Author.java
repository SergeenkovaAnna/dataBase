package com.example.database.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;
import java.util.Objects;

@Entity
public class Author {

    private String name;
    @Id
    @GeneratedValue
    private Integer authorId;

    @OneToMany
    private Collection<Book> books;

    public Author(String name, Integer authorId) {
        this.name = name;
        this.authorId = authorId;
    }

    public Author() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(authorId, author.authorId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, authorId);
    }

    @Override
    public String toString() {
        return "Author{" +
                "name='" + name + '\'' +
                ", authorId=" + authorId +
                '}';
    }
}
