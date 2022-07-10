package com.lucasbarbosa.designpattern.exercises.agenda.cache;

import com.lucasbarbosa.designpattern.exercises.agenda.model.Person;
import com.lucasbarbosa.designpattern.exercises.agenda.repository.Repository;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class AgendaCache implements Repository {

  private Map<Integer, Person> contacts;
  private Repository repository;

  private AgendaCache(Repository repository) {
    this.repository = repository;
    this.contacts = new HashMap<>();
  }

  public static AgendaCache build(Repository repository) {
    return new AgendaCache(repository);
  }

  @Override
  public void insert(Person person) {
    repository.insert(person);
    contacts.put(person.getCode(), person);
  }

  @Override
  public Person search(Integer code) {
    return Optional.ofNullable(contacts.get(code)).orElse(registerContact(code));
  }

  private Person registerContact(Integer code) {
    return Optional.ofNullable(repository.search(code))
        .map(
            person -> {
              contacts.put(person.getCode(), person);
              return person;
            })
        .orElse(new Person());
  }
}
