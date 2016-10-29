package com.example.model;

public interface IBook_ganres {
    @Override
    String toString();

    void setId(Long id);

    void setBook_ganre(String book_ganre);

    Long getId();

    String getBook_ganre();
}
