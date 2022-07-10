package com.lucasbarbosa.designpattern.exercises.finance.repository;

import com.lucasbarbosa.designpattern.exercises.finance.builder.EntryBuilder;
import com.lucasbarbosa.designpattern.exercises.finance.model.Entry;
import com.lucasbarbosa.designpattern.exercises.finance.model.EntryType;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EntryRepository {

  private static List<Entry> entries;

  static {
    entries = new ArrayList<>();
    Entry entryOne =
        EntryBuilder.builder()
            .fromPerson("John", "john@email.com", "(11)9999-8888")
            .withDescription("Table")
            .ofValue(BigDecimal.ONE)
            .withExpirationDate(LocalDate.now().plusDays(10))
            .fromType(EntryType.OUTCOME)
            .build();
    Entry entryTwo =
        EntryBuilder.builder()
            .fromPerson("Travis", "travis@email.com", "(11)9324-1322")
            .withDescription("Table")
            .ofValue(BigDecimal.TEN)
            .withExpirationDate(LocalDate.now().plusDays(5))
            .fromType(EntryType.OUTCOME)
            .build();
    entries.add(entryOne);
    entries.add(entryTwo);
  }

  public static List<Entry> getEntries(){
      return entries;
  }

}
