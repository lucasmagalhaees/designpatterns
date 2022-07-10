package com.lucasbarbosa.designpattern.exercises.agenda.repository;

import com.lucasbarbosa.designpattern.exercises.agenda.driver.Agenda;
import com.lucasbarbosa.designpattern.exercises.agenda.model.Person;

public class AgendaRepository implements Repository {

  @Override
  public void insert(Person person) {
    Agenda.insert(person);
  }

  @Override
  public Person search(Integer code) {
    return Agenda.search(code);
  }
}
