package com.purespectrum.rest.api.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.swing.*;

public class AuthorsModel {

    @Id
    private Integer id;

    @Column(nullable = false)
    private Spring name;
}
