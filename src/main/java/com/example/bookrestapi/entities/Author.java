package com.example.bookrestapi.entities;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;
@Entity
@Table(name ="author")
public class Author {
    @Id
    private UUID authorid;
    @JsonProperty("authorfirstname")
    private String AuthorFirstName;
    @JsonProperty("authorlastname")
    private String authorlastname;


    public void setAuthorId(UUID authorId) {
        authorid = authorId;
    }

    public void setAuthorFirstName(String authorFirstName) {
        AuthorFirstName = authorFirstName;
    }

    public void setAuthorLastName(String authorLastName) {
        authorLastName = authorLastName;
    }

    public Author() {
        authorid=new UUID(0L, 0L);
        AuthorFirstName =new String();
        authorlastname=new String();
    }
    public Author(String authorFirstName, String authorLastName){
        authorid=UUID.randomUUID();
        AuthorFirstName =authorFirstName;
        authorlastname=authorLastName;
    }
}
