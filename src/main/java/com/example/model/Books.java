package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter @Setter
@AllArgsConstructor
@Entity(name = "books")
@Table(name = "books")
public class Books implements IBooks {


  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", length = 6, nullable = false)
  private Long id;
  @Column
  private String book_name;
  @Column
  private Long book_author;
  @Column
  private Long book_genre;

  public Books() {
  }

  @Override
  public String toString() {
    return "Books{" +
            "id=" + id +
            ", book_name='" + book_name + '\'' +
            ", book_author=" + book_author +
            ", book_genre=" + book_genre +
            '}';
  }

  @Override
  public void setAuthor_name(String author_name) {

  }

  @Override
  public void setAuthor_book(Long author_book) {

  }

  @Override
  public String getAuthor_name() {
    return String.valueOf(getBook_author());
  }

  @Override
  public Long getAuthor_book() {
    return book_author;
  }
}
