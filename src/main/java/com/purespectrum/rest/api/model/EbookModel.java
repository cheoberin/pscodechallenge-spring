package com.purespectrum.rest.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.awt.print.Book;

@Entity (name = "book")
public class EbookModel extends Book {

    @Column(nullable = false)
    private String format;

}
