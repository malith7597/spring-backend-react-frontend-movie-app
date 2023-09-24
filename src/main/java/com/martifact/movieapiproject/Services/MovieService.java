package com.martifact.movieapiproject.Services;

import com.martifact.movieapiproject.Models.Movie;
import com.martifact.movieapiproject.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService  {

    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> allMovies(){
        return movieRepository.findAll();

    }

    public Optional<Movie> getSingleMovieByObjectId(ObjectId id){
        return movieRepository.findMovieById(id);
    }


    public Optional<Movie> getSingleMovie(String  imdbId){
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
