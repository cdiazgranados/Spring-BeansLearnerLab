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
    public Classroom currentCohort(List<Instructor> instructors, List<Student> students) {
        return new Classroom(instructorsConfig.instructors(instructors), studentConfig.currentStudents(students));
    }

    @Bean
    public Classroom previousCohort(List<Instructor> instructors, List<Student> students) {
        return new Classroom(instructorsConfig.instructors(instructors), studentConfig.previousStudents(students));
    }
}
