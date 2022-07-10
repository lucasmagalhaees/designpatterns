package com.lucasbarbosa.designpattern.exercises.agenda.entrypoint;

import com.lucasbarbosa.designpattern.exercises.agenda.cache.AgendaCache;
import com.lucasbarbosa.designpattern.exercises.agenda.model.Person;
import com.lucasbarbosa.designpattern.exercises.agenda.repository.AgendaRepository;
import com.lucasbarbosa.designpattern.exercises.agenda.repository.Repository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AgendaEntrypoint {
  public static void main(String[] args) {

    Repository repository = AgendaCache.build(new AgendaRepository());

    var personOne = repository.search(1);
    var personTwo = new Person(542, "Carlos", "4231-4232");
    repository.insert(personTwo);
    var foundPersonTwo = repository.search(542);
    log.info("personOne is {}", personOne);
    log.info("personTwo is {}", foundPersonTwo);
  }
}
