package com.example.bookrestapi.services;

import com.example.bookrestapi.dao.BookRepository;
import com.example.bookrestapi.entities.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Component
public class BookServices {

    @Autowired
    private BookRepository bookRepository;
//    private static List<Book> bookList = new ArrayList<>();
//
//    static {
//        bookList.add(new Book(12, "ABC", "DEF"));
//        bookList.add(new Book(13, "GHI", "JKL"));
//        bookList.add(new Book(14, "MNO", "PQR"));
//        bookList.add(new Book(15, "STU", "VXY"));
//    }

    public List<Book> getAllBooks() {
        return (List<Book>) this.bookRepository.findAll();
    }

    public Book getBookById(UUID id) {
        try {
            return this.bookRepository.findBookById(id);
        } catch (Exception e){
            System.out.println("Exception: "+ e);
        }
        return null;
    }

    public Book addBook(Book book) {
        book.setId(UUID.randomUUID());
        try {
            return this.bookRepository.save(book);
        }  catch (Exception ex){
            System.out.println(ex);
        }
        return null;
    }

    public void deleteBook(UUID bookId) {
        this.bookRepository.deleteById(bookId);
    }

    public Book updateBook(Book book) {
        return this.bookRepository.save(book);
    }
}
