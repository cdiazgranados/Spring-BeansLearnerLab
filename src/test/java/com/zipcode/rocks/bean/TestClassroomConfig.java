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
@ContextConfiguration(classes = {ClassroomConfig.class})
public class TestClassroomConfig {
    @Autowired
    ClassroomConfig classroomConfig;

    @Test
    @Qualifier("currentCohort")
    public void testClassroomConfig() {
        int expected = 2;
        Classroom config = classroomConfig.currentCohort();
        config.getInstructors();
        Assert.assertEquals(expected, config.getInstructors().size());
    }

    @Test
    @Qualifier("previousCohort")
    public void testClassroomConfig1() {
        int expected = 3;
        Classroom config = classroomConfig.previousCohort();
        config.getInstructors();
        Assert.assertEquals(expected, config.getStudents().size());
    }
}
