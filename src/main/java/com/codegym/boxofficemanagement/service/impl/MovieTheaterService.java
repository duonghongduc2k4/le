package com.codegym.boxofficemanagement.service.impl;

import com.codegym.boxofficemanagement.model.MovieTheater;
import com.codegym.boxofficemanagement.repository.IAccountRepository;
import com.codegym.boxofficemanagement.repository.IMovieTheaterRepository;
import com.codegym.boxofficemanagement.service.IMovieTheaterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MovieTheaterService implements IMovieTheaterService {
    @Autowired
    private IMovieTheaterRepository iMovieTheaterRepository;
    @Override
    public Iterable<MovieTheater> findAll() {
        return iMovieTheaterRepository.findAll();
    }

    @Override
    public void save(MovieTheater movieTheater) {
        iMovieTheaterRepository.save(movieTheater);
    }

    @Override
    public Optional<MovieTheater> findById(Long id) {
        return iMovieTheaterRepository.findById(id);
    }

    @Override
    public void remove(Long id) {
        iMovieTheaterRepository.deleteById(id);
    }
}
