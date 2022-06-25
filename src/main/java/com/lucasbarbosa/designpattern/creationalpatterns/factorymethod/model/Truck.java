package com.lucasbarbosa.designpattern.creationalpatterns.factorymethod.model;

import com.lucasbarbosa.designpattern.creationalpatterns.factorymethod.driver.EnvironmentEnum;
import com.lucasbarbosa.designpattern.creationalpatterns.factorymethod.driver.Product;
import com.lucasbarbosa.designpattern.creationalpatterns.factorymethod.interfaces.Transport;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Truck extends Transport {

  private Truck() {
    super(EnvironmentEnum.LAND);
  }

  public static Truck create(){
    return new Truck();
  }

  @Override
  public void deliver(Product product) {
    var name = product.getName().replace("-", "");
    setCargoNumber(product.emitFragileLabel().concat(name));
  }
}
