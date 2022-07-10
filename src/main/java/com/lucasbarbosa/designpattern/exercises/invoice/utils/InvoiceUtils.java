package com.lucasbarbosa.designpattern.exercises.invoice.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class InvoiceUtils {

  public static BigDecimal doPercentage(Integer number) {
    return new BigDecimal(number).add(oneHundred()).divide(oneHundred(), 2, RoundingMode.HALF_UP);
  }

  private static BigDecimal oneHundred() {
    return new BigDecimal(100);
  }
}
