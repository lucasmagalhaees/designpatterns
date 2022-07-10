package com.lucasbarbosa.designpattern.structural.decorator.driver;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class BankDTO {

  private String account;
  private String documentNumber;
}
