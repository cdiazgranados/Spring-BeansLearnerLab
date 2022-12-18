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
@ContextConfiguration(classes = {StudentConfig.class})
public class TestStudentConfig {

    @Autowired
    StudentConfig studentConfig;


    @Test
    @Qualifier("students")
    public void TestStudentConfig1(){
    Students students = new Students();
        students.add(new Student(1L, "Calvin"));
        students.add(new Student(2L, "Andrew"));
        students.add(new Student(3L, "Carolina"));
        int size = students.size();


        System.out.println("Students created in test: " + students.toString());
        System.out.println(size);



        int expected = 1;
        Students config = studentConfig.currentStudents();
        System.out.println("Students created in class: " + config.toString());
        System.out.println(config.size());
        Assert.assertEquals(expected, config.size());
    }

    @Test
    @Qualifier("students")
    public void TestStudentConfig(){
        Students students = new Students();
        students.add(new Student(1L, "Calvin"));
        students.add(new Student(2L, "Andrew"));
        students.add(new Student(3L, "Carolina"));
        int size = students.size();


        System.out.println("Students created in test: " + students.toString());
        System.out.println(size);



        int expected = 3;
        Students config = studentConfig.currentStudents();
        System.out.println("Students created in class: " + config.toString());
        System.out.println(config.size());
        Assert.assertEquals(expected, config.size());
    }


    @Test
    @Qualifier("previousStudents")
    public void TestStudentConfig2(){
//        Students students = new Students();
//        students.add(new Student(1L, "Calvin"));
//        students.add(new Student(2L, "Andrew"));
//        students.add(new Student(3L, "Carolina"));
//        int size = students.size();
//
//
//        System.out.println("Students created in test: " + students.toString());
//        System.out.println(size);
//        Student[] array = students.getArray();
//        System.out.println(array[0].getName());



        int expected = 1;
        Students config = studentConfig.previousStudents();
        System.out.println("Students created in class: " + config.toString());
        System.out.println(config.size());
        Assert.assertEquals(expected, config.size());
    }



}
