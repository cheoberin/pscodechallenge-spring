package com.purespectrum.rest.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "user")
public class UserModel {


    @Id
    private Integer code;
    @Column(nullable = false, length = 50)
    private String name;
    @Column(nullable = false, length = 10)
    private String login;
    @Column(nullable = false, length = 10)
    private String password;

    public Integer getCode() {
        return this.code;
    }

    public void setCode(Integer cod) {
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
