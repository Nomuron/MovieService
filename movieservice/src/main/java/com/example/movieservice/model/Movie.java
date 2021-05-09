package com.example.movieservice.model;

public class Movie {

    private Long ID;
    private String name;
    private String category;

    public Movie(Long ID, String name, String category) {
        this.ID = ID;
        this.name = name;
        this.category = category;
    }

    public Long getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }
}
