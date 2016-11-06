package com.example.controller;

import com.example.model.Book;
import com.example.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class BookViewController {
    @Autowired
    private IBookRepository bookRepository;

    @GetMapping
    public ModelAndView index() {
        ModelAndView mv = new ModelAndView("index");

        mv.addObject("name", "user");

        List<Book> findedBooks = bookRepository.findAll();
        mv.addObject("books", findedBooks);
        mv.addObject("newBook", new Book());
        return mv;
    }


    @PostMapping("/save")
    public View saveOrUpdate(Book book) {
        View view = new RedirectView("/");
        if (book.getId() == null) {
            bookRepository.save(book);
            return view;
        }
        Book existBook = bookRepository.findOne(book.getId());
        if (existBook != null) {
            existBook.setBookAuthor(book.getBookAuthor());
            existBook.setBookGenre(book.getBookGenre());
            existBook.setBookName(book.getBookName());

            bookRepository.save(existBook);
            return view;
        }
        bookRepository.save(book);
        return view;
    }


}
