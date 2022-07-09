package com.purespectrum.rest.api.model;

import javax.persistence.*;
import java.util.List;

@Entity (name = "author")
public class AuthorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String name;

    @ManyToMany(mappedBy = "authors")
    private List<BookModel> books;

}
