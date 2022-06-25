package com.lucasbarbosa.designpattern.creationalpatterns.factorymethod.model;

import com.lucasbarbosa.designpattern.creationalpatterns.factorymethod.driver.EnvironmentEnum;
import com.lucasbarbosa.designpattern.creationalpatterns.factorymethod.driver.Product;
import com.lucasbarbosa.designpattern.creationalpatterns.factorymethod.interfaces.Transport;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car extends Transport {

  private Car() {
    super(EnvironmentEnum.LAND);
  }

  public static Car create(){
    return new Car();
  }

  @Override
  public void deliver(Product product) {
    var name = product.getName().replace("-", "");
    setCargoNumber(product.emitFragileLabel().concat(name));
  }

}
