package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@Entity(name = "author")
@Table(name = "author")
public class Authors implements IAuthors {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", length = 6, nullable = false)
  private Long id;
  @Column
  private String author_name;
  @Column
  private Long author_book;


  public Authors() {
  }

  @Override
  public String toString() {
    return "Authors{" +
            "id=" + id +
            ", author_name='" + author_name + '\'' +
            ", author_book=" + author_book +
            '}';
  }
}

