package com.lucasbarbosa.designpattern.creationalpatterns.factorymethod.usecase;

import com.lucasbarbosa.designpattern.creationalpatterns.factorymethod.driver.EnvironmentEnum;
import com.lucasbarbosa.designpattern.creationalpatterns.factorymethod.driver.Product;
import com.lucasbarbosa.designpattern.creationalpatterns.factorymethod.model.Boat;
import com.lucasbarbosa.designpattern.creationalpatterns.factorymethod.model.Car;
import com.lucasbarbosa.designpattern.creationalpatterns.factorymethod.model.Ship;
import com.lucasbarbosa.designpattern.creationalpatterns.factorymethod.model.Truck;
import com.lucasbarbosa.designpattern.creationalpatterns.factorymethod.interfaces.Logistics;
import com.lucasbarbosa.designpattern.creationalpatterns.factorymethod.interfaces.Transport;

public class RoadLogistics implements Logistics {

  @Override
  public Transport createTransport(Product product) {
    if(product.isHeavy()){
      return Truck.create();
    }

    return Car.create();
  }
}
