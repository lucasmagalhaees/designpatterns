package com.lucasbarbosa.designpattern.exercises.invoice.entrypoint;

import com.lucasbarbosa.designpattern.exercises.invoice.usecase.BillBuilder;
import java.math.BigDecimal;
import java.util.Random;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class InvoiceEntrypoint {

  public static void main(String[] args) {
    var companyBill =
        BillBuilder.builder()
            .ofLegalPerson()
            .withId(new Random().nextLong())
            .withEmissionDate("24/09/2020")
            .withProduct("Avocado", 30, BigDecimal.ONE)
            .withProduct("Banana", 70, BigDecimal.ONE)
            .build();

    var personBill =
        BillBuilder.builder()
            .ofNaturalPerson()
            .withId(new Random().nextLong())
            .withEmissionDate("05/08/2020")
            .withProduct("Lemon", 50, BigDecimal.ONE)
            .withProduct("Papaya", 50, BigDecimal.ONE)
            .build();

    log.info("company bill is {}", companyBill.sumTotal());
    log.info("person bill is {}", personBill.sumTotal());
  }
}
