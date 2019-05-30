package com.example.academy.resource;

import com.example.academy.model.Cities;
import com.example.academy.service.CitiesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/cities")
public class CitiesResource {

    @Autowired
    CitiesService citiesService;

    @GetMapping("/")
    public List<Cities> getCities(){
        return citiesService.findAll();
    }

}
