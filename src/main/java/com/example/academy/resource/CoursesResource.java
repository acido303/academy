package com.example.academy.resource;

import com.example.academy.model.Courses;
import com.example.academy.repository.CoursesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.Vector;

/**
 * Created by jasanchez on 19/04/2019.
 */

@RestController
@RequestMapping ("/rest/courses")
public class CoursesResource {

    @Autowired
    CoursesRepository coursesRepository;

    @GetMapping("/")
    public List<Courses> getCourses(){
        return coursesRepository.findAll();
    }

    @GetMapping("/t")
    public List<Courses> getUser(@RequestParam(value = "courseName",required = false) final Optional<String> courseName) {

        if (courseName.isPresent()) {
            String nameOpt=courseName.get();
            return coursesRepository.findCustom(nameOpt);
        }
        else{
            return coursesRepository.findAll();
        }
    }

    @GetMapping("/country/{name}")
    public List<Courses> getCustom(@PathVariable final String name){
        return coursesRepository.findCustom(name);
    }

    @GetMapping(value = "/test")
    public List<Courses> findPaginated(@RequestParam("page") int page,
                                       @RequestParam("size") int size,
                                       @RequestParam(value = "country", required = false) final Optional<String> country,
                                       @RequestParam(value = "priceMin",required = false) final Optional<Integer> priceMin,
                                       @RequestParam(value = "priceMax",required = false) final Optional<Integer> priceMax) {

        System.out.printf("Page:%d\n",page);
        System.out.printf("Size:%d\n",size);

        System.out.printf("PriceMin:%s\n",priceMin.toString());
        System.out.printf("PriceMax:%s\n",priceMax.toString());

        if (country.isPresent()) {
            System.out.printf("Country:%s\n",country.toString());
            String countryName = country.map(String::toString).get();
            System.out.printf("Country:%s\n",countryName);

            return coursesRepository.findCustom(countryName);

        }


        //Page<Courses> resultPage = coursesRepository.findCustomByPrice(page,size);
        /*
        if (page > resultPage.getTotalPages()) {
            throw new MyResourceNotFoundException();
        }

        */

        return coursesRepository.findAll();
    }
        //return coursesRepository.findCustomByPrice(name, name);


    /*
    @GetMapping("/query")
    public List<Courses> queryCoursesByPrice(@RequestParam(required = false) final Integer price){
        return coursesRepository.findByPrice(price);
    }
    */

    /*
    @GetMapping("/query")
    public List<Courses> queryCoursesByCity(@RequestParam(required = false) final Integer city){
        return coursesRepository.findByCity(city);
    }
    */

    @GetMapping("/query")
    public String query(@RequestParam(required = false) String country,
                        @RequestParam(required = false) String city

                        ) {

            System.out.print(country);
            System.out.print(city);

        return "TEST!";
    }


    @GetMapping("/id/{id}")
    public Optional<Courses> getId(@PathVariable final Integer id){
        return coursesRepository.findById(id);
    }

    /*
    @GetMapping("/id/{id}/{name}")
    public Optional<Courses> update(@PathVariable final Integer id,@PathVariable final String name){
        Optional<Courses> course = getId(id);
        if (course.isPresent()) {
            course.get().setName(name);
            return course;
        }
        else{
            return new Optional<Courses>();
        }
    }
    */
}
