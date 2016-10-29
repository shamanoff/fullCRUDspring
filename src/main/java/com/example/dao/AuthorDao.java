package com.example.dao;

import com.example.model.Authors;
import com.example.model.IAuthors;
import com.example.repository.IAuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorDao implements IAuthorDao {

    @Autowired
    private IAuthorRepository iAuthorRepository;

    @Override
    public void saveOrUpdate(Authors author) {
        iAuthorRepository.save(author);
    }


    @Override
    public IAuthors findOne(Long id) {
        return iAuthorRepository.findOne(id);

    }


    @Override
    public List<Authors> findAll() {
        return iAuthorRepository.findAll();
    }


    @Override
    public IAuthors delete(Long id) {
        IAuthors authors = iAuthorRepository.findOne(id);
        iAuthorRepository.delete(id);
        return authors;
    }

}

