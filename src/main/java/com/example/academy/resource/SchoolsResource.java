package com.example.academy.resource;

import com.example.academy.model.Schools;

import com.example.academy.repository.SchoolsRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/schools")
public class SchoolsResource {

    @Autowired
    SchoolsRepository schoolsRepository;

    @GetMapping("/")
    public List<Schools> getSchools(){
        return schoolsRepository.findAll();
    }


}