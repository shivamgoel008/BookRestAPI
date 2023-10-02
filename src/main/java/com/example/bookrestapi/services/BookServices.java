package com.example.bookrestapi.services;

import com.example.bookrestapi.entities.Book;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class BookServices {
    private static List<Book> bookList= new ArrayList<>();
    static {
        bookList.add(new Book(12,"ABC","DEF"));
        bookList.add(new Book(13,"GHI","JKL"));
        bookList.add(new Book(14,"MNO","PQR"));
        bookList.add(new Book(15,"STU","VXY"));
    }
    public List<Book> getAllBooks(){
        return bookList;
    }
    public Book getBookById(int id){
        Book book =new Book();
        book= bookList.stream().filter(e->e.getId()==id).findFirst().get();
        return book;
    }
    public void addBook(Book book){
        bookList.add(book);
    }
}
