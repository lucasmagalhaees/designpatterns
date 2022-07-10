package com.lucasbarbosa.designpattern.exercises.invoice.interfaces;

import com.lucasbarbosa.designpattern.exercises.invoice.model.Bill;
import java.math.BigDecimal;

public interface BillSchema {

  public Bill build();

  public BillSchema withId(Long id);

  public BillSchema withEmissionDate(String emissionDate);

  public BillSchema withProduct(String name, Integer amount, BigDecimal price);
}
