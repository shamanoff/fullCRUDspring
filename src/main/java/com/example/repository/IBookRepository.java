package com.example.repository;

import com.example.model.Books;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBookRepository extends JpaRepository<Books, Long> {
}
