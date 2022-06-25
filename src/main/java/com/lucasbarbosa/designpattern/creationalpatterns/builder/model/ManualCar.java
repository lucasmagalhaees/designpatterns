package com.lucasbarbosa.designpattern.creationalpatterns.builder.model;

import com.lucasbarbosa.designpattern.creationalpatterns.builder.driver.Engine;
import com.lucasbarbosa.designpattern.creationalpatterns.builder.driver.EngineType;
import com.lucasbarbosa.designpattern.creationalpatterns.builder.interfaces.CarBuilder;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class ManualCar extends Car implements CarBuilder {

  protected ManualCar(Integer seats,
      Engine engine, boolean hasTripComputer, boolean hasGPS) {
    super(seats, engine, hasTripComputer, hasGPS);
  }

  @Override
  public Car reset() {
    return new ManualCar();
  }

  @Override
  public Integer placeSeats() {
    return 4;
  }

  @Override
  public Engine placeEngine() {
    return Engine.mountEngine(EngineType.V8, true);
  }

  @Override
  public boolean hasTripComputer() {
    return false;
  }

  @Override
  public boolean hasGPS() {
    return false;
  }

  @Override
  public Car mountCar() {
    return new ManualCar(placeSeats(), placeEngine(), hasTripComputer(), hasGPS());
  }

}
