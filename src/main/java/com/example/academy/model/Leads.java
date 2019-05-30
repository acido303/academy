package com.example.academy.model;


import javax.persistence.*;

/**
 * Created by jasanchez on 19/04/2019.
 */

@Entity
@Table (name = "leads_tbl")
public class Leads {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "leads_seq")
    @Column(name="lead_id")
    private Integer id;
    @Column(name="lead_name")
    private String name;
}
