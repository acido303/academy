package com.example.academy.service;

import com.example.academy.model.Cities;
import com.example.academy.repository.CitiesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;

@Service
public class CitiesService {

    private final CitiesRepository citiesRepository;

    public CitiesService(CitiesRepository citiesRepository) {
        this.citiesRepository = citiesRepository;
    }

    public List<Cities> findAll(){
        List<Cities> cities = citiesRepository.findAll();
        //cities.sort(Comparator.comparing(Cities::getName).reversed());
        cities.sort(Comparator.comparing(Cities::getName));
        return cities;
    }
}
