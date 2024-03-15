package com.example.demo;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class MovieController {
    private List<Movie> movies = new ArrayList<>();

    public MovieController(){
        //initialize list with data

        movies.add(new Movie(1, "The Exorcist", 1973, "William Friedkin","Horror","Paranormal activities and demon possessions"));
        movies.add(new Movie(2, "The Lord of the Rings: The Two Towers", 2003,"Peter Jackson","Fantasy","Frodo and Sam go to Mordor, Saruman launches and assult"));
        movies.add(new Movie(3, "Star Wars: Episode I -The Phantom Menace", 1999,"George Lucas","Cience Fiction","Qui-Gon Jinn and Obi-Wan fight against Darth Maul"));
        movies.add(new Movie(4, "The Ring", 2003,"Gore Verbinski","Horror","Mysterious deaths cases"));
        movies.add(new Movie(5, "Avengers: Endgame", 2019,"Anthony Ruso","Super Heroes","Avenger must reunite and fight against Thanos"));
    }

    @GetMapping("/movies")
    public List<Movie> getMovies()  {
        return movies;
    }

    @GetMapping("/movies/{id}")
    public Movie getMovieById(@PathVariable int id){
        for (Movie movie : movies){
            if (movie.getId() == id){
                return movie;
            }
        }
        return null;
    }
}
