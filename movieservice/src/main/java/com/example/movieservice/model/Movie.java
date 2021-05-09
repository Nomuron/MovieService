package com.example.movieservice.model;

public class Movie {

    private Long ID;
    private String name;
    private Category category;

    public Movie(Long ID, String name, Category category) {
        this.ID = ID;
        this.name = name;
        this.category = category;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
