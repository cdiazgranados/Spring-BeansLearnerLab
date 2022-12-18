package com.zipcode.rocks.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class StudentConfig {


    Students currentStudents = new Students();
//    @Bean(name = "students")
//    public Students currentStudents(List<Student> currentCohort){
//        return new Students(currentCohort);
//    }

    @Bean(name = "students")
    public Students currentStudents(){
        currentStudents.add(new Student(1L, "Zach"));
        currentStudents.add(new Student(3L, "Emory"));
        currentStudents.add(new Student(5L, "Freddy"));
        return currentStudents;
    }

    @Bean(name = "previousStudents")
    public Students previousStudents(){
        Students previousStudents = new Students();
        previousStudents.add(new Student(5L, "Freddy"));
        return previousStudents;
    }
}
