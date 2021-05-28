package com.example.movieservice.service;

import com.example.movieservice.model.Movie;
import com.example.movieservice.repository.MovieRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

    public Movie findById(Long id) throws RuntimeException {
        Optional<Movie> searchingMovie = movieRepository.findById(id);
        if (searchingMovie.isPresent()) {
            return searchingMovie.get();
        } else {
            throw new RuntimeException();
        }
    }

    public Movie postMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    public Movie putMovie(Long id, Movie movie) throws RuntimeException {
        Optional<Movie> puttingMovie = movieRepository.findById(id);
        if (puttingMovie.isPresent()) {
            Movie putNewMovie = movie;
            putNewMovie.setID(id);
            return movieRepository.save(putNewMovie);
        } else {
            throw new RuntimeException();
        }
    }

    public Movie changeBoolean(Long id) throws RuntimeException {
        Optional<Movie> booleanMovie = movieRepository.findById(id);
        if (booleanMovie.isPresent()) {
            booleanMovie.get().setAvailable(true);
            return movieRepository.save(booleanMovie.get());
        } else {
            throw new RuntimeException();
        }
    }

    public void deleteMovie(Long id) {
        movieRepository.deleteById(id);
    }

}
