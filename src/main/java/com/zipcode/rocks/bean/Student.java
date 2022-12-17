package com.zipcode.rocks.bean;

public class Student extends Person implements Learner {

    double totalStudyTime;

    public Student(Long id, String name) {
        super(id, name);
    }

    @Override
    public void learn(Double numberOfHours) {
        totalStudyTime += numberOfHours;
    }


    public double getTotalStudyTime() {
        return totalStudyTime;
    }
}
