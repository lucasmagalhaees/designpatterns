package com.lucasbarbosa.designpattern.exercises.invoice.model;

import com.lucasbarbosa.designpattern.exercises.invoice.driver.Product;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Bill {

  private Long id;
  private LocalDate emissionDate;
  private List<Product> shoppingCart = new ArrayList<>();

  public abstract BigDecimal fetchTaxPercentage();

  public BigDecimal sumTotal() {
    return shoppingCart.stream()
        .map(Product::getTotal)
        .reduce(BigDecimal.ZERO, BigDecimal::add)
        .multiply(fetchTaxPercentage());
  }
}
