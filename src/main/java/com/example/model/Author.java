package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "authors")
public class Author {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", length = 6, nullable = false)
  private Long id;
  @Column(name = "author_name")
  private String authorName;



  public Author() {
  }

  @Override
  public String toString() {
    return "Author{" +
            "id=" + id +
            ", authorName='" + authorName + '\'' +
            '}';
  }
}

