package com.lucasbarbosa.designpattern.exercises.invoice.driver;

import java.math.BigDecimal;
import java.math.RoundingMode;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Product {

  private String name;
  private Integer amount;
  private BigDecimal price;

  public BigDecimal getTotal() {
    return new BigDecimal(amount).multiply(price).setScale(2, RoundingMode.HALF_UP);
  }
}
