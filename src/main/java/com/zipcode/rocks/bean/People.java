package com.zipcode.rocks.bean;

import java.util.List;

public abstract class People<T extends Person> implements Iterable<T> {
    List<T> personList;


    public People(List<T> personList) {
        this.personList = personList;
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


}
