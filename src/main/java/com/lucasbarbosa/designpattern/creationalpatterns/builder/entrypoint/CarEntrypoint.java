package com.lucasbarbosa.designpattern.creationalpatterns.builder.entrypoint;

import com.lucasbarbosa.designpattern.creationalpatterns.builder.converter.CarDirector;
import com.lucasbarbosa.designpattern.creationalpatterns.builder.usecase.AutomaticCarBuilder;
import com.lucasbarbosa.designpattern.creationalpatterns.builder.usecase.ManualCarBuilder;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CarEntrypoint {

  public static void main(String[] args) {
    CarDirector carDirector = new CarDirector();
    var automaticCar = carDirector.makeCar(new AutomaticCarBuilder());
    var manualCar = carDirector.makeCar(new ManualCarBuilder());

    log.info("auto car has {}", automaticCar);
    log.info("manual car has {}", manualCar);
    log.info("manual car was reset having {}", manualCar.reset());
  }
}
