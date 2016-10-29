package com.example.repository;

import com.example.model.Authors;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAuthorRepository extends JpaRepository<Authors, Long> {
}
