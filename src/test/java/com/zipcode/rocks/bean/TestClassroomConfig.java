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

    public void testClassroomConfig() {
        int expected = 1;
        Classroom config = classroomConfig.currentCohort();
//        Assert.assertEquals(expected, config.size());
    }
}
