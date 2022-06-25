package com.lucasbarbosa.designpattern.creationalpatterns.builder.interfaces;

import com.lucasbarbosa.designpattern.creationalpatterns.builder.driver.Engine;
import com.lucasbarbosa.designpattern.creationalpatterns.builder.model.Car;

public interface CarBuilder {

  Integer placeSeats();

  Engine placeEngine();

  boolean hasTripComputer();

  boolean hasGPS();

  Car mountCar();


}
