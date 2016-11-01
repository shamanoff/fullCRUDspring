package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@AllArgsConstructor
@Entity
@Table(name = "books")
public class Book {


  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", length = 6, nullable = false)
  private Long id;
  @Column(name = "book_name")
  private String bookName;
  @Column(name = "book_author")
  private Long bookAuthor;
  @Column(name = "book_genre")
  private Long bookGenre;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "book_author", insertable = false, updatable = false)
  private Author author;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "book_genre", insertable = false, updatable = false)
  private BookGenre genre;

  public Book() {
  }

  @Override
  public String toString() {
    return "Book{" +
            "id=" + id +
            ", bookName='" + bookName + '\'' +
            ", bookAuthor=" + bookAuthor +
            ", bookGenre=" + bookGenre +
            '}';
  }



}
