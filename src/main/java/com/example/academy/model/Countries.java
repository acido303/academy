package com.example.academy.model;


import javax.persistence.*;

/**
 * Created by jasanchez on 19/04/2019.
 */

@Entity
@Table (name = "countries_tbl")
public class Countries {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "countries_seq")
    @Column(name="country_id")
    private Integer id;
    @Column(name="country_name")
    private String name;
    @Column(name="country_image")
    private String image;


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

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
