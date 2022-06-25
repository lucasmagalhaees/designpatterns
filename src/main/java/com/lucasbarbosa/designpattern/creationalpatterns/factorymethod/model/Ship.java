package com.lucasbarbosa.designpattern.creationalpatterns.factorymethod.model;

import com.lucasbarbosa.designpattern.creationalpatterns.factorymethod.driver.EnvironmentEnum;
import com.lucasbarbosa.designpattern.creationalpatterns.factorymethod.driver.Product;
import com.lucasbarbosa.designpattern.creationalpatterns.factorymethod.interfaces.Transport;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Ship extends Transport {

  private Ship() {
    super(EnvironmentEnum.WATER);
  }

  public static Ship create(){
    return new Ship();
  }

  @Override
  public void deliver(Product product) {
    setCargoNumber(product.emitFragileLabel().concat(product.getName()));
  }

}
