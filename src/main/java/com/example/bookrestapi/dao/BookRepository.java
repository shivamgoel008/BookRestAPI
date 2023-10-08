package com.example.bookrestapi.dao;

import com.example.bookrestapi.entities.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface BookRepository extends CrudRepository<Book,UUID> {
    public Book findBookById(UUID id);
}
