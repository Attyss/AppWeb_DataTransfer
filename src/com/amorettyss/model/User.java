package com.amorettyss.model;

public class User {
    private int id;
    private String firstName;
    private String surName;
    //Constructor
    public User() {
    }

    public User(int id, String firstName, String surName) {
        this.id = id;
        this.firstName = firstName;
        this.surName = surName;
    }

    //Getter and Setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }
}
