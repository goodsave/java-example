package com.goodsave.example.spring.javadynamicproxy;

import java.util.List;

/**
 * Description
 * Created by Joker on 2017/7/27.
 */
public interface PersonDao {
    public void savePerson();

    public void deletePerson(String name);

    public void updatePerson();

    public List<Person> getPersons();
}
