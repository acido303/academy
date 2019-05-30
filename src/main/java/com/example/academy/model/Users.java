package com.example.academy.model;


import org.springframework.data.jpa.repository.Query;

import javax.persistence.*;

/**
 * Created by jasanchez on 19/04/2019.
 */

@Entity
@Table (name = "users_tbl")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users_seq")
    @Column(name="user_id")
    private Integer id;
    @Column(name="user_name")
    private String name;
    @Column(name="user_salary")
    private Integer salary;
    @Column(name="user_team_name")
    private String teamName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

}
