package com.lucasbarbosa.designpattern.creationalpatterns.builder.usecase;

import com.lucasbarbosa.designpattern.creationalpatterns.builder.driver.Engine;
import com.lucasbarbosa.designpattern.creationalpatterns.builder.interfaces.CarValidator;
import com.lucasbarbosa.designpattern.creationalpatterns.builder.model.Car;
import lombok.Getter;

@Getter
public abstract class CarBuilder implements CarValidator {

  private Car car;

  protected CarBuilder(Car car) {
    this.car = car;
  }

  public abstract CarValidator builder();

  @Override
  public CarValidator placeSeats(Integer seats) {
    this.car.setSeats(seats);
    return this;
  }

  @Override
  public CarValidator placeEngine(Engine engine) {
    this.car.setEngine(engine);
    return this;
  }

  @Override
  public CarValidator hasTripComputer(boolean hasTripComputer) {
    this.car.setHasTripComputer(hasTripComputer);
    return this;
  }

  @Override
  public CarValidator hasGPS(boolean hasGPS) {
    this.car.setHasGPS(hasGPS);
    return this;
  }

  @Override
  public Car build() {
    return this.car;
  }
}
