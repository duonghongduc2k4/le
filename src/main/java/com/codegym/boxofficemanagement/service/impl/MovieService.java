package com.codegym.boxofficemanagement.service.impl;

import com.codegym.boxofficemanagement.model.Account;
import com.codegym.boxofficemanagement.model.Movie;
import com.codegym.boxofficemanagement.repository.IAccountRepository;
import com.codegym.boxofficemanagement.repository.IMovieRepository;
import com.codegym.boxofficemanagement.service.IMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MovieService implements IMovieService {
    @Autowired
    private IMovieRepository iMovieRepository;

    @Override
    public Iterable<Movie> findAll() {
        return iMovieRepository.findAll();
    }

    @Override
    public void save(Movie movie) {
        iMovieRepository.save(movie);
    }

    @Override
    public Optional<Movie> findById(Long id) {
        return iMovieRepository.findById(id);
    }

    @Override
    public void remove(Long id) {
        iMovieRepository.deleteById(id);
    }
}
