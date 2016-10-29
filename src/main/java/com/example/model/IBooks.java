package com.example.model;

public interface IBooks extends IAuthors {
    @Override
    String toString();

    void setId(Long id);

    void setBook_name(String book_name);

    void setBook_author(Long book_author);

    void setBook_genre(Long book_genre);

    Long getId();

    String getBook_name();

    Long getBook_author();

    Long getBook_genre();
}
