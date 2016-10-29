package com.example.dao;

import com.example.model.Books;
import com.example.model.IBooks;

import java.util.List;

public interface IBookDao {
    void saveOrUpdate(Books books);

    IBooks findOne(Long id);

    List<Books> findAll();

    IBooks delete(Long id);
}
