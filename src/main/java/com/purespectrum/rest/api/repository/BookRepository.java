package com.purespectrum.rest.api.repository;

import com.purespectrum.rest.api.model.BookModel;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<BookModel, Long> {
}
