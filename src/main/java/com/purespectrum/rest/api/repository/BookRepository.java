package com.purespectrum.rest.api.repository;

import com.purespectrum.rest.api.model.BookModel;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<BookModel, Long> {



}
