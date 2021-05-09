package com.example.movieservice.service;

import com.example.movieservice.model.Movie;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.example.movieservice.model.Category.*;

@Service
public class MovieService {


    public List<Movie> findAll() {
        return List.of(new Movie(1L, "Marian", Horror), new Movie(2L, "Ferdynand", Comedy));
    }

    public Movie findById(Long id) {
        return new Movie(id, "Arnold", Action);
    }

    public Movie postMovie(Movie movie) {
        return movie;
    }

    public Movie putMovie(Movie movie) {
        return movie;
    }

    public void deleteMovie(Long id) {

    }

}
