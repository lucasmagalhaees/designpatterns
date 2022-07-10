package com.lucasbarbosa.designpattern.exercises.agenda.repository;

import com.lucasbarbosa.designpattern.exercises.agenda.model.Person;

public interface Repository {

  void insert(Person person);

  Person search(Integer code);
}
