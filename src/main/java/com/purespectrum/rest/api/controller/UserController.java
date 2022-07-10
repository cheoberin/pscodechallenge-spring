package com.purespectrum.rest.api.controller;

import com.purespectrum.rest.api.model.UserModel;
import com.purespectrum.rest.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @Autowired
    private UserRepository repository;

    @GetMapping(path = "/api/user/{userCod}")
    public ResponseEntity check(@PathVariable("userCod") Long code){
        return repository.findById(code).map(record -> ResponseEntity.ok().body(record)).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping(path = "/api/user/new")
    public UserModel save(@RequestBody UserModel user){
        return repository.save(user);
    }
}
