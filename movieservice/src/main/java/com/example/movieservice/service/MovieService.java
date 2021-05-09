package com.example.movieservice.service;

import com.example.movieservice.model.Movie;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {


    public List<Movie> findAll() {
        return List.of(new Movie(1L, "Marian", "Horror"), new Movie(2L, "Ferdynand", "Komedia"));
    }

    public Movie findById(Long id) {
        return new Movie(id, "Arnold", "Dramat");
    }

}
