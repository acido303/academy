package com.example.academy.service;

import com.example.academy.model.Users;
import com.example.academy.repository.UsersRepository;
import org.springframework.stereotype.Service;

import java.util.List;

// Test OTRO CAMBIO

@Service
public class UsersService {

    private final UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public List<Users> findAll(){
        return usersRepository.findAll();
    }


}