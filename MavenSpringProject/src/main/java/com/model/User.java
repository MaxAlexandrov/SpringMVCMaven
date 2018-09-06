package com.model;

/**
 * Created by user on 04.09.18.
 */
public class User {
    private String password;
    private String name;

    public User(String password, String name) {
        this.password = password;
        this.name = name;
    }

    public User() {

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "passwor='" + password + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
