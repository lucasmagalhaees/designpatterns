package com.lucasbarbosa.designpattern.exercises.invoice.usecase;

import com.lucasbarbosa.designpattern.exercises.invoice.model.Bill;
import com.lucasbarbosa.designpattern.exercises.invoice.model.LegalPersonBill;
import com.lucasbarbosa.designpattern.exercises.invoice.model.NaturalPersonBill;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class BillBuilder {

  private Bill bill;

  public static BillBuilder builder() {
    return new BillBuilder();
  }

  public BillValidator ofNaturalPerson() {
    this.setBill(new NaturalPersonBill());
    return validateBill();
  }

  public BillValidator ofLegalPerson() {
    this.setBill(new LegalPersonBill());
    return validateBill();
  }

  private BillValidator validateBill() {
    return new BillValidator(bill);
  }
}
