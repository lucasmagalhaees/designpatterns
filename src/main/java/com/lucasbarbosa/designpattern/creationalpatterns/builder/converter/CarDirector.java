package com.lucasbarbosa.designpattern.creationalpatterns.builder.converter;

import com.lucasbarbosa.designpattern.creationalpatterns.builder.interfaces.CarBuilder;
import com.lucasbarbosa.designpattern.creationalpatterns.builder.model.Car;

public class CarDirector {

  public Car makeCar(CarBuilder carBuilder){
    return carBuilder.mountCar();
  }
}
