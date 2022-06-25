package com.lucasbarbosa.designpattern.creationalpatterns.factorymethod.model;

import com.lucasbarbosa.designpattern.creationalpatterns.factorymethod.driver.EnvironmentEnum;
import com.lucasbarbosa.designpattern.creationalpatterns.factorymethod.driver.Product;
import com.lucasbarbosa.designpattern.creationalpatterns.factorymethod.interfaces.Transport;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Boat extends Transport {

  private Boat() {
    super(EnvironmentEnum.WATER);
  }

  public static Boat create(){
    return new Boat();
  }

  @Override
  public void deliver(Product product) {
    setCargoNumber(product.emitFragileLabel().concat(product.getName()));
  }

}
