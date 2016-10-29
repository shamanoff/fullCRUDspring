package com.example.model;

public interface IAuthors {
    @Override
    String toString();

    void setId(Long id);

    void setAuthor_name(String author_name);

    void setAuthor_book(Long author_book);

    Long getId();

    String getAuthor_name();

    Long getAuthor_book();
}
