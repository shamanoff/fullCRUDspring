package com.example.service;

import com.example.model.Book;
import com.example.repository.IAuthorRepository;
import com.example.repository.IBookRepository;
import com.example.repository.IGenreRepository;
import com.example.represent.BookRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BookService {
    @Autowired
    IBookRepository bookRepository;
    @Autowired
    IAuthorRepository authorRepository;
    @Autowired
    IGenreRepository genreRepository;

    @Transactional
    public Book save(BookRep bookRep) {



       /* Book oldBook = bookRepository.findOne((bookRep.getId()));
        BookGenre oldGenre = genreRepository.findOne(bookRep.getId());*/


      /*  Author author = new Author();
        author.setAuthorName(bookRep.getAuthor());
        Long authorId = authorRepository.saveAndFlush(author).getId();*/

/*
        BookGenre genre = new BookGenre();
        genre.setBookGenre(bookRep.getGenre());
        Long genreId = genreRepository.saveAndFlush(genre).getId();*/


        Book book = bookRepository.findOne(bookRep.getId());

        if (!book.getAuthor().equals(bookRep.getAuthor())) {
            book.setBookName(bookRep.getBookName());
            return bookRepository.saveAndFlush(book);
        }
        return book;

      /*  book.setBookAuthor(authorId);
        book.setBookGenre(genreId);*/


    }

}
