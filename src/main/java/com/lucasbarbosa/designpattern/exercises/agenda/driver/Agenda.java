package com.lucasbarbosa.designpattern.exercises.agenda.driver;

import com.lucasbarbosa.designpattern.exercises.agenda.model.Person;
import java.util.HashMap;
import java.util.Map;

public class Agenda {
  private static Map<Integer, Person> registers;

  static {
    registers = new HashMap<>();
    registers.put(1, new Person(1, "Andrew", "8888-5555"));
    registers.put(2, new Person(2, "Lisa", "7878-5555"));
    registers.put(3, new Person(3, "John", "4444-8245"));
  }

  public static void insert(Person person) {
    person.setCode(registers.size() + 1);
    registers.put(person.getCode(), person);
  }

  public static Person search(Integer code) {
    return registers.get(code);
  }
}
