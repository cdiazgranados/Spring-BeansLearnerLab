package com.zipcode.rocks.bean;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Alumni {
    @Autowired
    @Qualifier("previousStudents")
    Students previousCohort;

    @Autowired
    @Qualifier("tcUsaInstructors")
    Instructors instructors;

    @PostConstruct
    public void executeBootCamp(){
        Instructor instructor1 = instructors.personList.get(0);
        Instructor instructor2 = instructors.personList.get(1);
        Instructor instructor3 = instructors.personList.get(2);
        instructor1.lecture(previousCohort.personList, 200);
        instructor2.lecture(previousCohort.personList, 200);
        instructor3.lecture(previousCohort.personList, 200);
    }

//    @PostConstruct
//    public Instructor executeBootCamp(){
//        return instructors.personList.get(0);
//    }

    public Students getPreviousCohort() {
        return previousCohort;
    }

    public Instructors getInstructors() {
        return instructors;
    }

}
