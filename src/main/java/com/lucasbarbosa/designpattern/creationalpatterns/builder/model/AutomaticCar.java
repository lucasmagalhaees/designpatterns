package com.lucasbarbosa.designpattern.creationalpatterns.builder.model;

import com.lucasbarbosa.designpattern.creationalpatterns.builder.driver.Engine;
import com.lucasbarbosa.designpattern.creationalpatterns.builder.driver.EngineType;
import com.lucasbarbosa.designpattern.creationalpatterns.builder.interfaces.CarBuilder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class AutomaticCar extends Car implements CarBuilder {

  protected AutomaticCar(Integer seats,
      Engine engine, boolean hasTripComputer, boolean hasGPS) {
    super(seats, engine, hasTripComputer, hasGPS);
  }

  @Override
  public Car reset() {
    return new AutomaticCar();
  }

  @Override
  public Integer placeSeats() {
    return 4;
  }

  @Override
  public Engine placeEngine() {
    return Engine.mountEngine(EngineType.V6, true);
  }

  @Override
  public boolean hasTripComputer() {
    return true;
  }

  @Override
  public boolean hasGPS() {
    return true;
  }

  @Override
  public Car mountCar() {
    return new AutomaticCar(placeSeats(), placeEngine(), hasTripComputer(), hasGPS());
  }
}
