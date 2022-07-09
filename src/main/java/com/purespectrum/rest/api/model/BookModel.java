package com.purespectrum.rest.api.model;

import javax.persistence.*;
import java.util.List;

@Entity (name = "book")
public class BookModel {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @ManyToMany
    @JoinTable(name = "book_author", joinColumns = @JoinColumn(name = "book_fk"), inverseJoinColumns = @JoinColumn(name = "author_fk"))
    private List<AuthorModel> authors;

    @Column(nullable = false)
    private String publisher;

    @Column(nullable = false)
    private Integer publicationYear;

    @Column(nullable = false)
    private String summary;

}
