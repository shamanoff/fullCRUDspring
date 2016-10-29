package com.example.controller;

import com.example.dao.IBookDao;
import com.example.model.Books;
import com.example.model.IBooks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class BookController {

    @Autowired
    public IBookDao iBookDao;
    @PostMapping("/saveOrUpdate")
    public ResponseEntity saveOrUpdate(@RequestBody Books books){
        iBookDao.saveOrUpdate(books);
        return ResponseEntity.ok().build();
    }
    @GetMapping("/all")
    public ResponseEntity<List<Books>> findAll(){
        return ResponseEntity.ok(iBookDao.findAll());
    }
    @RequestMapping(value = "/find/{id}", method = RequestMethod.GET)
    public ResponseEntity<IBooks> find(@PathVariable("id")Long id){
        return ResponseEntity.ok(iBookDao.findOne(id));
    }



    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public IBooks delete (@PathVariable("id")Long id){
        ResponseEntity.ok(iBookDao.findOne(id));
        return iBookDao.delete(id);
    }

}
