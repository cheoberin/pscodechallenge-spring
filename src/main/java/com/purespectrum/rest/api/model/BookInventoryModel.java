package com.purespectrum.rest.api.model;

import javax.persistence.*;

@Entity(name = "book_inventory")
public class BookInventoryModel {

    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "book_id", nullable = false)
    private BookModel book;

    @Column(nullable = false)
    private Long stock;

}
