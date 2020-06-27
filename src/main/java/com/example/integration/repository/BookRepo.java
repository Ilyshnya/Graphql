package com.example.integration.repository;

import com.example.integration.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



public interface BookRepo extends JpaRepository<Book,Long> {
}
