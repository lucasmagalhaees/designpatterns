package com.lucasbarbosa.designpattern.exercises.invoice.model;

import static com.lucasbarbosa.designpattern.exercises.invoice.utils.InvoiceUtils.doPercentage;

import java.math.BigDecimal;

public class NaturalPersonBill extends Bill {

  @Override
  public BigDecimal fetchTaxPercentage() {
    return doPercentage(7);
  }
}
