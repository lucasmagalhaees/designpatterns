package com.lucasbarbosa.designpattern.exercises.finance.builder;

import com.lucasbarbosa.designpattern.exercises.finance.model.Entry;
import com.lucasbarbosa.designpattern.exercises.finance.model.EntryType;
import com.lucasbarbosa.designpattern.exercises.finance.model.Person;
import java.math.BigDecimal;
import java.time.LocalDate;

public class EntryBuilder {

  private Entry entry;

  public EntryBuilder() {
    this.entry = new Entry();
  }

  public static EntryBuilder builder() {
    return new EntryBuilder();
  }

  public EntryBuilder fromPerson(String name, String email, String phoneNumber) {
    Person person = new Person();
    person.setName(name);

    person.setEmail(email);
    person.setPhoneNumber(phoneNumber);
    this.entry.setPerson(person);

    return this;
  }

  public EntryBuilder withDescription(String description) {
    this.entry.setDescription(description);
    return this;
  }

  public EntryBuilder ofValue(BigDecimal value) {
    this.entry.setValue(value);
    return this;
  }

  public EntryBuilder fromType(EntryType type) {
    this.entry.setType(type);
    return this;
  }

  public EntryBuilder withExpirationDate(LocalDate expirationDate) {
    this.entry.setExpirationDate(expirationDate);
    return this;
  }

  public Entry build() {
    return this.entry;
  }
}
