package com.example.academy.service;

import com.example.academy.model.Countries;
import com.example.academy.repository.CountriesRepository;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class CountriesService {

    private final CountriesRepository countriesRepository;

    public CountriesService(CountriesRepository countriesRepository) {
        this.countriesRepository = countriesRepository;
    }

    public List<Countries> findAll(){
        List<Countries> countries = countriesRepository.findAll();
        countries.sort(Comparator.comparing(Countries::getName));
        return countries;
    }
}
