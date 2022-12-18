package com.zipcode.rocks.bean;

import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Students extends People<Student>{
    private static final Students INSTANCE = new Students();

    public Students(List<Student> personList) {
        super(personList);
    }

    public Students(){
    }

//    public Students() {
//        this.add(new Student(1L, "Zach"));
//    }

    public static Students getInstance(){
        return INSTANCE;
    }

    public Student[] getArray() {
        return this.toArray(new Student[0]);
    }

    @Override
    public Iterator<Student> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super Student> action) {
        super.forEach(action);
    }

    @Override
    public Spliterator<Student> spliterator() {
        return super.spliterator();
    }
}
