package com.example.dao;

import com.example.model.Authors;
import com.example.model.IAuthors;

import java.util.List;

public interface IAuthorDao {
    void saveOrUpdate(Authors author);

    IAuthors findOne(Long id);

    List<Authors> findAll();

    IAuthors delete(Long id);
}
