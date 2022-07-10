package com.lucasbarbosa.designpattern.creationalpatterns.builder.usecase;

import com.lucasbarbosa.designpattern.creationalpatterns.builder.driver.Engine;
import com.lucasbarbosa.designpattern.creationalpatterns.builder.driver.EngineType;
import com.lucasbarbosa.designpattern.creationalpatterns.builder.interfaces.CarValidator;
import com.lucasbarbosa.designpattern.creationalpatterns.builder.model.ManualCar;

public class ManualCarBuilder extends CarBuilder {

  public ManualCarBuilder() {
    super(new ManualCar());
  }

  @Override
  public CarValidator builder() {
    return new ManualCarBuilder()
        .hasGPS(false)
        .hasTripComputer(false)
        .placeEngine(Engine.mountEngine(EngineType.V6, false))
        .placeSeats(4);
  }
}
