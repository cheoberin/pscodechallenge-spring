package com.purespectrum.rest.api.controller;

import com.purespectrum.rest.api.model.BookModel;
import com.purespectrum.rest.api.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookRepository repository;

    @PostMapping
    public BookModel post(@RequestBody BookModel book){
        return repository.save(book);
    }

    @GetMapping(path = "/api/book/{bookCode}")
    public ResponseEntity getBook(@PathVariable("bookCode") Long code){
        return repository.findById(code).map(record -> ResponseEntity.ok().body(record)).orElse(ResponseEntity.notFound().build());
    }

    @GetMapping(path = "/api/book/author/{authorName}")
    public ResponseEntity getBookByAuthor(@PathVariable("authorName") String author){
        List<BookModel> result = new ArrayList<BookModel>();
        repository.findAll().forEach(book -> {result.add(book);});
        return ResponseEntity.ok().body((result));
    }



    @GetMapping(path = "/api/book/")

    @PostMapping(path = "/api/book/new")
    public BookModel save(@RequestBody BookModel book){
        return repository.save(book);
    }
}
