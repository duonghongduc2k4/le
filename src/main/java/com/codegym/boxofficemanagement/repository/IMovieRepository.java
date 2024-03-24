package com.codegym.boxofficemanagement.repository;

import com.codegym.boxofficemanagement.model.Account;
import com.codegym.boxofficemanagement.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface IMovieRepository extends JpaRepository<Movie,Long> {

}