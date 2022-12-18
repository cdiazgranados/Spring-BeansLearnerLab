package com.zipcode.rocks.bean;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestAlumni {

    @Autowired
    Alumni alumni;

    @Test
    public void testAlumni() {

        int numberOfInstructors = alumni.getInstructors().size();
        int numberOfStudents = alumni.getPreviousCohort().size();
        double numberOfHoursToTeachEachStudent = 1200.0;
        double numberOfHoursToTeach = numberOfHoursToTeachEachStudent * numberOfStudents;
        double numberOfHoursPerInstructor = numberOfHoursToTeach / numberOfInstructors;
        System.out.println("Number of hours per instructor: " + numberOfHoursPerInstructor);
        alumni.executeBootCamp();
        double expected = 1200.0;
        double actual = alumni.getPreviousCohort().personList.get(0).getTotalStudyTime();
        System.out.println("hours learned: " + actual);
        Assert.assertEquals(expected, actual, .0);
    }
}
