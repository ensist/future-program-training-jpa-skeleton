package com.gdn.future.program.training.jpa.repository;

import com.gdn.future.program.training.jpa.model.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface MovieRepository extends JpaRepository<Movie, String> {

  Movie findFirstByMovieId(String movieId);

  @Transactional
  long deleteByMovieId(String movieId);
}
