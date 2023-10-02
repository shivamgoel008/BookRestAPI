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
@RestController
public class BookController {
    @Autowired
    private BookServices bookServices;

   @GetMapping("/books")
    public List<Book> getBooks(){
       return this.bookServices.getAllBooks();
   }
   @GetMapping("/books/{id}")
    public Book getBookById(@PathVariable("id") int id){
       return this.bookServices.getBookById(id);
   }
   @PostMapping("/addbook")
    public void addBook(@RequestBody Book book){
       this.bookServices.addBook(book);
   }
}
