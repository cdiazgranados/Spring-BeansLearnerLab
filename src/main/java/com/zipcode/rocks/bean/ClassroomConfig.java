package com.zipcode.rocks.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ClassroomConfig {


    @Bean
    public Classroom currentCohort() {
        Students currentStudents = new Students();
        currentStudents.add(new Student(1L, "Zach"));
        currentStudents.add(new Student(3L, "Emory"));
        currentStudents.add(new Student(5L, "Freddy"));
        Instructors instructors = new Instructors();
        instructors.add(new Instructor(1L, "Solow"));
        instructors.add(new Instructor(2L, "Starkweather"));

        Classroom classroom = new Classroom(instructors, currentStudents);
        return classroom;
    }

    @Bean
    public Classroom previousCohort() {
        Students currentStudents = new Students();
        currentStudents.add(new Student(1L, "Zach"));
        currentStudents.add(new Student(3L, "Emory"));
        currentStudents.add(new Student(5L, "Freddy"));
        Instructors instructors = new Instructors();
        instructors.add(new Instructor(1L, "Solow"));
        instructors.add(new Instructor(2L, "Starkweather"));

        Classroom classroom = new Classroom(instructors, currentStudents);
        return classroom;
    }
}
