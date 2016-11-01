package com.example.controller;

import com.example.model.Book;
import com.example.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class BookViewController {
    @Autowired
    private IBookRepository bookRepository;
    @GetMapping
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView("index");

        mv.addObject("name", "user");

        List<Book> findedBooks = bookRepository.findAll();
        mv.addObject("books", findedBooks);

        return mv;
    }

}
