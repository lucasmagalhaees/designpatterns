package com.lucasbarbosa.designpattern.creationalpatterns.builder.interfaces;

import com.lucasbarbosa.designpattern.creationalpatterns.builder.driver.Engine;
import com.lucasbarbosa.designpattern.creationalpatterns.builder.model.Car;

public interface CarValidator {

  CarValidator placeSeats(Integer seats);

  CarValidator placeEngine(Engine engine);

  CarValidator hasTripComputer(boolean hasTripComputer);

  CarValidator hasGPS(boolean hasGPS);

  Car build();
}
