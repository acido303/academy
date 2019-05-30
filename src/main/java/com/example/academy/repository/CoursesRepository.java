package com.example.academy.repository;

import com.example.academy.model.Courses;

import org.springframework.cglib.core.Predicate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Created by jasanchez on 19/04/2019.
 */
public interface CoursesRepository extends JpaRepository<Courses, Integer> {

    List<Courses> findAll();




    @Query("Select c from Courses c, Schools sc, Cities ci, Countries co " +
           "where c.school.id= sc.id " +
           "and sc.city.id= ci.id " +
           "and ci.country.id= co.id " +
           "and co.name= ?1 ")
    List<Courses> findCustom(String countryName);

    @Query("select c from Courses c where c.price > :x")
    public Page<Courses> findCustomByPrice(@Param("x") String name, Pageable p);


}