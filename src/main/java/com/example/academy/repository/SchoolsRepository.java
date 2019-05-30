package com.example.academy.repository;

import com.example.academy.model.Schools;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SchoolsRepository extends JpaRepository<Schools, Integer> {
    List<Schools> findAll();

}
