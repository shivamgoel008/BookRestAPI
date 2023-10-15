package com.example.bookrestapi.entities;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
@Table(name ="books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    private String title;
    @OneToOne(cascade = CascadeType.ALL)
    private Author author;
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }
    public  Book (UUID id, String title, Author author){
        this.id=id;
        this.title = title;
        this.author = author;
    }
    public  Book (){
        this.id=new UUID(0L,0L);
        this.title = "";
        this.author = new Author();
    }
}
