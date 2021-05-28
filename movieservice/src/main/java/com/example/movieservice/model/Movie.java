package com.example.movieservice.model;

import javax.persistence.*;

@Entity
@Table(name = "movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long ID;
    private String name;
    @Enumerated(EnumType.STRING)
    private Category category;
    private boolean isAvailable;

    public Movie(Long ID, String name, Category category, boolean isAvailable) {
        this.ID = ID;
        this.name = name;
        this.category = category;
        this.isAvailable = isAvailable;
    }

    public Movie() {

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

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
