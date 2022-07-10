package com.lucasbarbosa.designpattern.creationalpatterns.builder.converter;

import com.lucasbarbosa.designpattern.creationalpatterns.builder.model.Car;
import com.lucasbarbosa.designpattern.creationalpatterns.builder.usecase.CarBuilder;

public class CarDirector {

  public Car makeCar(CarBuilder carBuilder) {
    return carBuilder.builder().build();
  }
}
