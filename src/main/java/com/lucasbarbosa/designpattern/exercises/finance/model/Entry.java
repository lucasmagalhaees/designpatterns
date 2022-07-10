package com.lucasbarbosa.designpattern.exercises.finance.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Entry {

  private Long code;
  private Person person;
  private String description;
  private BigDecimal value;
  private EntryType type;
  private LocalDate expirationDate;
}
