package com.example.bookrestapi.controller;

import com.example.bookrestapi.entities.Book;
import com.example.bookrestapi.services.BookServices;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
public class BookController {
    @Autowired
    private BookServices bookServices;

    @GetMapping("/books")
    public List<Book> getBooks() {
        return this.bookServices.getAllBooks();
    }

    @GetMapping("/books/{id}")
    public Book getBookById(@PathVariable("id") UUID id) {
        return this.bookServices.getBookById(id);
    }

    @PostMapping("/addbook")
    public void addBook(@RequestBody Book book) {
        this.bookServices.addBook(book);
    }

    @DeleteMapping("/deletebook/{id}")
    public void deleteBookById(@PathVariable("id") UUID id) {
        this.bookServices.deleteBook(id);
    }

    @PutMapping("/updatebook/{id}")
    public Book updateBookById(@PathVariable("id") UUID id, @RequestBody Book book) {
        return this.bookServices.updateBook(book);
    }
}
