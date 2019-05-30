package com.example.academy.resource;

import com.example.academy.model.Countries;

import com.example.academy.repository.CountriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/countries")
public class CountriesResource {

    @Autowired
    CountriesRepository countriesRepository;

    @GetMapping("/")
    public List<Countries> getCountries(){
        return countriesRepository.findAll();
    }


}