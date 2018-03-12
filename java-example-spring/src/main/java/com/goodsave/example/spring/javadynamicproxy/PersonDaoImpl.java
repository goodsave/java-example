package com.goodsave.example.spring.javadynamicproxy;

/**
 * Description
 * Created by Joker on 2017/7/27.
 */

import java.util.ArrayList;
import java.util.List;

public class PersonDaoImpl implements PersonDao {

    @Override
    public void savePerson() {
        System.out.println("savePerson");
    }

    @Override
    public void deletePerson(String name) {
        System.out.println("deletePerson");
    }

    @Override
    public void updatePerson() {
        System.out.println("updatePerson");

    }

    @Override
    public List<Person> getPersons() {
        List<Person> persons = new ArrayList<>();
        Person person1 = new Person(1, "person1");
        Person person2 = new Person(2, "person2");
        persons.add(person1);
        persons.add(person2);
        return persons;
    }

}
