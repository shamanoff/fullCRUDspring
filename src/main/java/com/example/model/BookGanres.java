package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@Entity(name = "bookGanre")
@Table(name = "book_ganre")
public class BookGanres implements IBook_ganres {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", length = 6, nullable = false)
  private Long id;
  @Column
  private String book_ganre;

  public BookGanres() {
  }

  @Override
  public String toString() {
    return "BookGanres{" +
            "id=" + id +
            ", book_ganre='" + book_ganre + '\'' +
            '}';
  }
}
