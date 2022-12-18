package com.zipcode.rocks.bean;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;

public abstract class People<T extends Person> implements Iterable<T> {
    List<T> personList;


    public People(List<T> personList) {
        this.personList = personList;
    }

    public People() {
        this(new ArrayList<>());
    }



    public void add(T t) {
        personList.add(t);
    }

    public void remove(T t) {
        personList.remove(t);
    }

    public int size() {
        return personList.size();
    }

    public void clear() {
        personList.clear();
    }

    public void addAll(Iterable<T> list) {
        personList.add((T) list);
    }

    public T[] toArray(Student[] students) {
        T[] newArray = (T[]) Array.newInstance(personList.get(0).getClass(), personList.size());
        for (int i=0; i<personList.size(); i++) {
            newArray[i] = personList.get(i);
        }
        return newArray;
    }

    public T findById(Long id) {
        for(int i = 0; i < personList.size(); i++) {
            if(personList.get(i).getId() == id) {
                return personList.get(i);
            }
        }
        return null;
    }

    public List<T> findAll() {
        return personList;
    }


    @Override
    public String toString() {
        String str = "";
        for (T t: personList) {
            str += t.getName();
        }
        return str;
    }

    @Override
    public Iterator<T> iterator() {
        return personList.iterator();
    }

    @Override
    public void forEach(Consumer<? super T> action) {
        Iterable.super.forEach(action);
    }

    @Override
    public Spliterator<T> spliterator() {
        return Iterable.super.spliterator();
    }
}
