package com.example.repository;

import com.example.model.BookGenre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IGenreRepository extends JpaRepository<BookGenre, Long> {
}
