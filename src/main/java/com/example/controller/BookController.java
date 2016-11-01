package com.example.controller;

import com.example.model.Book;
import com.example.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class BookController {

    @Autowired
    public IBookRepository bookRepository;

    @PostMapping("/saveOrUpdate")
    public ResponseEntity<Book> saveOrUpdate(@RequestBody Book book) {

        Book existBook = bookRepository.findOne(book.getId());
        if (existBook != null) {
            existBook.setBookAuthor(book.getBookAuthor());
            existBook.setBookGenre(book.getBookGenre());
            existBook.setBookName(book.getBookName());

            bookRepository.save(existBook);
            return ResponseEntity.ok(existBook);
        }
        bookRepository.save(book);
        return ResponseEntity.ok(book);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Book>> findAll() {
        return ResponseEntity.ok(bookRepository.findAll());
    }


    @RequestMapping(value = "/find/{id}", method = RequestMethod.GET)
    public ResponseEntity<Book> find(@PathVariable("id") Long id) {
        return ResponseEntity.ok(bookRepository.findOne(id));
    }


    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Book> delete(@PathVariable("id") Long id) {
        Book book = bookRepository.findOne(id);
        bookRepository.delete(id);
        return ResponseEntity.ok(book);
    }

}
