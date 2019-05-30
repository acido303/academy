package com.example.academy.repository;

import com.example.academy.model.Countries;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CountriesRepository extends JpaRepository<Countries, Integer>{
    List<Countries> findAll();

}
