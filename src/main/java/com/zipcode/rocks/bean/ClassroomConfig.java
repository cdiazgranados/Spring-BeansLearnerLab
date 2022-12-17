package com.zipcode.rocks.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ClassroomConfig {
    @Bean
    public Classroom currentCohort(Instructors instructors, Students students) {
        return new Classroom(instructors, students);
    }

    @Bean
    public Classroom previousCohort(Instructors instructors, Students students) {
        return new Classroom(instructors, students);
    }
}
