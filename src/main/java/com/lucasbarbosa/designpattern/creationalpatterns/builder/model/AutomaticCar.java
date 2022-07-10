package com.lucasbarbosa.designpattern.creationalpatterns.builder.model;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class AutomaticCar extends Car {

  @Override
  public Car reset() {
    return new AutomaticCar();
  }
}
