package com.example.academy.repository;

import com.example.academy.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


/**
 * Created by jasanchez on 19/04/2019.
 */
public interface UsersRepository extends JpaRepository<Users, Integer> {
    List<Users> findByName(String name);


}
