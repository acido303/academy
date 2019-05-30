package com.example.academy.resource;

import com.example.academy.model.Users;
import com.example.academy.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

/**
 * Created by jasanchez on 19/04/2019.
 */

@RestController
@RequestMapping ("/rest/users")
public class UsersResource {

    @Autowired
    UsersRepository usersRepository;

    @GetMapping("/")
    public List<Users> getUsers(){
        return usersRepository.findAll();
    }

    @GetMapping("/{name}")
    public List<Users> getUser(@PathVariable final String name){
        return usersRepository.findByName(name);
    }

    @GetMapping("/id/{id}")
    public Optional<Users> getId(@PathVariable final Integer id){
        return usersRepository.findById(id);
    }

    @GetMapping("/id/{id}/{name}")
    public Optional<Users> update(@PathVariable final Integer id,@PathVariable final String name){
        Optional<Users> user = getId(id);
        user.get().setName(name);
        return user;
    }

}
