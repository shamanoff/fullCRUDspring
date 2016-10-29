package com.example.dao;

import com.example.model.Books;
import com.example.model.IBooks;
import com.example.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookDao implements IBookDao {
    @Autowired
    private IBookRepository iBookRepository;

    @Override
    public void saveOrUpdate(Books books) {
        iBookRepository.save(books);
    }

    @Override
    public IBooks findOne(Long id) {
        return iBookRepository.findOne(id);

    }

    @Override
    public List<Books> findAll() {
        return iBookRepository.findAll();
    }

    @Override
    public IBooks delete(Long id) {
        IBooks books = iBookRepository.findOne(id);
        iBookRepository.delete(id);
        return books;
    }

}
