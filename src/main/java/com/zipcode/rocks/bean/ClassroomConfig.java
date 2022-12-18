package com.zipcode.rocks.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ClassroomConfig {
    @Autowired
    InstructorsConfig instructorsConfig;
    @Autowired
    StudentConfig studentConfig;
    @Bean
    public Classroom currentCohort() {
        return new Classroom(instructorsConfig.instructors(), studentConfig.currentStudents());
    }

    @Bean
    public Classroom previousCohort() {
        return new Classroom(instructorsConfig.instructors(), studentConfig.previousStudents());
    }
}
