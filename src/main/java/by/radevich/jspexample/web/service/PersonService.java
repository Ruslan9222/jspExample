package by.radevich.jspexample.web.service;

import by.radevich.jspexample.model.Person;

import java.util.List;

public interface PersonService {
    void save(Person person);
    List<Person> findAll();
    List<Person>fiendByName(String name);
}
