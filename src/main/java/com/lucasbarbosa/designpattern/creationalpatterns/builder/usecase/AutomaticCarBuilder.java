package com.lucasbarbosa.designpattern.creationalpatterns.builder.usecase;

import com.lucasbarbosa.designpattern.creationalpatterns.builder.driver.Engine;
import com.lucasbarbosa.designpattern.creationalpatterns.builder.driver.EngineType;
import com.lucasbarbosa.designpattern.creationalpatterns.builder.interfaces.CarValidator;
import com.lucasbarbosa.designpattern.creationalpatterns.builder.model.AutomaticCar;

public class AutomaticCarBuilder extends CarBuilder {

  public AutomaticCarBuilder() {
    super(new AutomaticCar());
  }

  @Override
  public CarValidator builder() {
    return new AutomaticCarBuilder()
        .hasGPS(true)
        .hasTripComputer(true)
        .placeEngine(Engine.mountEngine(EngineType.V8, true))
        .placeSeats(4);
  }
}
