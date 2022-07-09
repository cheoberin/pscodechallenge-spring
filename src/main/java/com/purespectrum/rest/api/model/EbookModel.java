package com.purespectrum.rest.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity (name = "ebook")
public class EbookModel extends BookModel {

    @Column(nullable = false)
    private String format;

}
