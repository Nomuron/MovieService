package com.example.movieservice.controller;

import com.example.movieservice.model.Movie;
import com.example.movieservice.service.MovieService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/movies")
public class MovieController {

    private final MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping
    public ResponseEntity<List<Movie>> findAllMovies() {
        return ResponseEntity.ok(movieService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movie> findMovieById(@PathVariable Long id) {
        return ResponseEntity.ok(movieService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Movie> postMovie(@RequestBody Movie movie) {
        return ResponseEntity.ok(movieService.postMovie(movie));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Movie> putMovie(@PathVariable Long id, @RequestBody Movie movie) {
        return ResponseEntity.ok(movieService.putMovie(id, movie));
    }

    @PutMapping("/{id}/true")
    public ResponseEntity<Movie> changeBool(@PathVariable Long id) {
        return ResponseEntity.ok(movieService.changeBoolean(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMovie(@PathVariable Long id) {
        movieService.deleteMovie(id);
        return ResponseEntity.noContent().build();
    }
}
