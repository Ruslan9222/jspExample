package by.radevich.jspexample.service;

import by.radevich.jspexample.model.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonService {
    private List<Person> persons = new ArrayList<>();

    public void save(Person person){
        persons.add(person);
    }
    public List<Person> findAll(){
        return persons;
    }
    public List<Person>fiendByName(String name){
        return persons.stream().filter(person -> person.getName().equals(name))
                .collect(Collectors.toList());

    }
}
