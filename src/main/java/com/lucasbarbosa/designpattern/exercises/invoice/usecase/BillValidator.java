package com.lucasbarbosa.designpattern.exercises.invoice.usecase;

import com.lucasbarbosa.designpattern.exercises.invoice.driver.Product;
import com.lucasbarbosa.designpattern.exercises.invoice.interfaces.BillSchema;
import com.lucasbarbosa.designpattern.exercises.invoice.model.Bill;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class BillValidator implements BillSchema {

  private Bill bill;

  @Override
  public Bill build() {
    return this.bill;
  }

  @Override
  public BillSchema withId(Long id) {
    this.bill.setId(id);
    return this;
  }

  @Override
  public BillSchema withEmissionDate(String emissionDate) {
    this.bill.setEmissionDate(
        LocalDate.parse(emissionDate, DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    return this;
  }

  @Override
  public BillSchema withProduct(String name, Integer amount, BigDecimal price) {
    Product product = fetchProduct(name, amount, price);
    var products = this.bill.getShoppingCart();
    products.add(product);
    this.bill.setShoppingCart(products);
    return this;
  }

  private Product fetchProduct(String name, Integer amount, BigDecimal price) {
    return new Product(name, amount, price);
  }
}
