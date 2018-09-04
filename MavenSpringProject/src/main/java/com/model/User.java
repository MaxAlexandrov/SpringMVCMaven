package com.model;

/**
 * Created by user on 04.09.18.
 */
public class User {
    private String passwor;
    private String name;

    public User(String passwor, String name) {
        this.passwor = passwor;
        this.name = name;
    }

    public User() {

    }

    public String getPasswor() {
        return passwor;
    }

    public void setPasswor(String passwor) {
        this.passwor = passwor;
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
                "passwor='" + passwor + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
