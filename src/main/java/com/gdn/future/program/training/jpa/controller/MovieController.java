package com.gdn.future.program.training.jpa.controller;

import com.gdn.future.program.training.jpa.model.constants.ApiPath;
import com.gdn.future.program.training.jpa.model.entity.Movie;
import com.gdn.future.program.training.jpa.service.MovieService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Api
@RestController
public class MovieController {

  @Autowired
  private MovieService movieService;

  @GetMapping(ApiPath.MOVIE_BY_MOVIE_ID)
  public Movie findByMovieId(@PathVariable String movieId) {
//    return movieService.findByMovieId(movieId);
    return new Movie();
  }

  @PostMapping(ApiPath.MOVIE)
  public Movie save(@RequestBody Movie movie) {
    return new Movie();
  }

  @DeleteMapping(ApiPath.MOVIE_BY_MOVIE_ID)
  public boolean deleteByMovieId(@PathVariable String movieId) {
    return true;
  }
}
