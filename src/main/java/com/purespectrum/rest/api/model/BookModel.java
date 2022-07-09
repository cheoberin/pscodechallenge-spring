package com.purespectrum.rest.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity (name = "book")
public class BookModel {


    @Id
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private AuthorsModel authors[];

    @Column(nullable = false)
    private String publisher;

    @Column(nullable = false)
    private Integer publicationYear;

    @Column(nullable = false)
    private String summary;

}
