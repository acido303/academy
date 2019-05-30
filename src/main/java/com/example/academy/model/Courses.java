package com.example.academy.model;


import javax.persistence.*;

/**
 * Created by jasanchez on 19/04/2019.
 */

@Entity
@Table (name = "courses_tbl")
public class Courses {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "courses_seq")
    @Column(name="course_id")
    private Integer id;

    @Column(name="course_name")
    private String name;

    @Column(name="course_price")
    private Integer price;

    @JoinColumn(name="school_id", referencedColumnName = "school_id")
    @OneToOne
    private Schools school;

    /*
    public Schools getSchool() {
        return school;
    }

    public void setSchool(Schools school) {
        this.school = school;
    }

    */

    public String getSchoolName() {
        return school.getName();
    }

    public String getSchoolImage() {
        return school.getImage();
    }


    public String getCityName() {
        return school.getCity().getName();
    }

    public String getCountryName() {
        return school.getCity().getCountry().getName();
    }

    public String getCountryImage() {
        return school.getCity().getCountry().getImage();
    }

    public String getSchoolAddress() {
        return school.getAddress();
    }


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

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

}
