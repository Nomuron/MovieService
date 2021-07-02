package com.example.movieservice.controller;

import com.example.movieservice.model.Movie;
import com.example.movieservice.service.MovieService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.ConnectException;
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

//    @GetMapping
//    public ResponseEntity<List<Movie>> findAllMovies() {
//        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();

//        return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();

//        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
//    }

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
    public ResponseEntity<Movie> changeBoolTrue(@PathVariable Long id) {
        return ResponseEntity.ok(movieService.changeBooleanTrue(id));
    }
    @PutMapping("/{id}/false")
    public ResponseEntity<Movie> changeBoolFalse(@PathVariable Long id) {
        return ResponseEntity.ok(movieService.changeBooleanFalse(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMovie(@PathVariable Long id) {
        movieService.deleteMovie(id);
        return ResponseEntity.noContent().build();
    }
}
