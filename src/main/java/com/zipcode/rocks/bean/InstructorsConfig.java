package com.zipcode.rocks.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class InstructorsConfig {

    @Bean
    public Instructors tcUsaInstructors(List<Instructor> tcUsa) {
        return new Instructors(tcUsa);
    }

    @Bean
    public Instructors tcUkInstructors(List<Instructor> tcUk) {
        return new Instructors(tcUk);
    }

    @Bean(name = "instructors")
    public Instructors instructors(List<Instructor> zipcode) {
        return new Instructors(zipcode);
    }

}
