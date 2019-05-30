package com.example.academy.service;

import com.example.academy.model.Courses;
import com.example.academy.repository.CoursesRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CoursesService {

    private final CoursesRepository coursesRepository;

    public CoursesService(CoursesRepository coursesRepository) {
        this.coursesRepository = coursesRepository;
    }

    public List<Courses> findAll(){
        return coursesRepository.findAll();
    }

    /*
    public List<Courses> findCustom(String countryName){
        return coursesRepository.findCustom(countryName);
    }
    */


}

