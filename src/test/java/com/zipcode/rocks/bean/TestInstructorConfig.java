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
@ContextConfiguration(classes = {InstructorsConfig.class})
public class TestInstructorConfig {

    @Autowired
    InstructorsConfig instructorsConfig;

    @Test
    @Qualifier("instructors")
    public void testTeacherConfig(){
     int expected = 2;
     Instructors config = instructorsConfig.instructors();
     Assert.assertEquals(expected, config.size());
    }

    @Test
    @Qualifier("tcUsaInstructors")
    public void testTeacherConfig1(){
        int expected = 3;
        Instructors config = instructorsConfig.tcUsaInstructors();
        Assert.assertEquals(expected, config.size());
    }

    @Test
    @Qualifier("tcUkInstructors")
    public void testTeacherConfig2(){
        int expected = 1;
        Instructors config = instructorsConfig.tcUkInstructors();
        Assert.assertEquals(expected, config.size());
    }
}
