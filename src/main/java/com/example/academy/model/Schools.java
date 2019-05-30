package com.example.academy.model;

import javax.persistence.*;

/**
 * Created by jasanchez on 20/04/2019.
 */
@Entity
@Table(name = "schools_tbl")
public class Schools {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "schools_seq")
    @Column(name="school_id")
    private Integer id;
    @Column(name="school_name")
    private String name;

    @OneToOne
    @JoinColumn(name="city_id", referencedColumnName = "city_id")
    private Cities city;

    @Column(name="school_image")
    private String image;

    @Column(name="school_address")
    private String address;



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

    public Cities getCity() {
        return city;
    }

    public void setCity(Cities city) {
        this.city = city;
    }

    public String getImage() { return image; }

    public void setImage(String image) { this.image = image; }

    public String getAddress() { return address; }

    public void setAddress(String address) { this.address = address; }

}
