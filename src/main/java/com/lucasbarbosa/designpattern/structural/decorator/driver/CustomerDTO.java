package com.lucasbarbosa.designpattern.structural.decorator.driver;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CustomerDTO {

  private String name;
  private String country;
  private String address;
}
