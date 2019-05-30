package com.example.academy.model;


import javax.persistence.*;

/**
 * Created by jasanchez on 19/04/2019.
 */

@Entity
@Table (name = "cities_tbl")
public class Cities {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cities_seq")
    @Column(name="city_id")
    private Integer id;

    @Column(name="city_name")
    private String name;


    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="country_id", referencedColumnName = "country_id")
    private Countries country;


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

    public Countries getCountry() {
        return country;
    }

    public void setCountry(Countries country) {
        this.country = country;
    }
}
