package com.lucasbarbosa.designpattern.creationalpatterns.builder.model;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ManualCar extends Car {

  @Override
  public Car reset() {
    return new ManualCar();
  }
}
