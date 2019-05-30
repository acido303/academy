package com.example.academy.service;

import com.example.academy.model.Courses;
import com.example.academy.repository.CoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoursesService {

    @Autowired
    CoursesRepository coursesRepository;

    public List<Courses> findAll(){
        return coursesRepository.findAll();
    }

    public List<Courses> findCustom(String countryName){
        return coursesRepository.findCustom(countryName);
    }


}

