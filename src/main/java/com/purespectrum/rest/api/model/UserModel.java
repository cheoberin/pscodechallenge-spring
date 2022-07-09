package com.purespectrum.rest.api.model;

import javax.persistence.*;

@Entity(name = "user")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long code;
    @Column(nullable = false, length = 50)
    private String name;
    @Column(nullable = false, length = 10)
    private String login;
    @Column(nullable = false, length = 10)
    private String password;

    public Long getCode() {
        return this.code;
    }

    public void setCode(Long cod) {
        this.code = cod;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
