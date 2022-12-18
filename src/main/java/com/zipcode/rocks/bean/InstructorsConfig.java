package com.zipcode.rocks.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.List;



@Configuration
public class InstructorsConfig {

    Instructors instructors = new Instructors();

    Instructors tcUkInstructors = new Instructors();
    @Bean(name = "tcUsaInstructors")
    public Instructors tcUsaInstructors() {
        Instructors tcUsaInstructors = new Instructors();
        tcUsaInstructors.add(new Instructor(1L, "Dolio"));
        tcUsaInstructors.add(new Instructor(2L, "Kris"));
        tcUsaInstructors.add(new Instructor(3L, "Dan"));
        return tcUsaInstructors;
    }

    @Bean(name = "tcUkInstructors")
    public Instructors tcUkInstructors() {
        tcUkInstructors.add(new Instructor(1L, "Hagrid"));
        return tcUkInstructors;
    }
    @Primary
    @Bean(name = "instructors")
    public Instructors instructors() {
        instructors.add(new Instructor(1L, "Solow"));
        instructors.add(new Instructor(2L, "Starkweather"));
        return instructors;
    }

}
