package com.example.academy.repository;

import com.example.academy.model.Cities;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by jasanchez on 24/04/2019.
 */

@Repository
public interface CitiesRepository extends PagingAndSortingRepository<Cities, Long> {
    List<Cities> findAll();
}