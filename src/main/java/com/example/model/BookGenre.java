package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "book_genres")
public class BookGenre {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", length = 6, nullable = false)
  private Long id;
  @Column(name = "book_genre")
  private String bookGenre;

  public BookGenre() {
  }

  @Override
  public String toString() {
    return "BookGenre{" +
            "id=" + id +
            ", bookGenre='" + bookGenre + '\'' +
            '}';
  }
}
