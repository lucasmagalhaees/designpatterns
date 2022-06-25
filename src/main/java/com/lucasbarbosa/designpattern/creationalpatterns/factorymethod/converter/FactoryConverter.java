package com.lucasbarbosa.designpattern.creationalpatterns.factorymethod.converter;

import com.lucasbarbosa.designpattern.creationalpatterns.factorymethod.driver.Product;
import com.lucasbarbosa.designpattern.creationalpatterns.factorymethod.interfaces.Transport;
import com.lucasbarbosa.designpattern.creationalpatterns.factorymethod.usecase.RoadLogistics;
import com.lucasbarbosa.designpattern.creationalpatterns.factorymethod.usecase.SeaLogistics;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class FactoryConverter {

  public static Transport convert(Product product) {
    if (product.isFragile()) {
      return new SeaLogistics().planDelivery(product);
    }
    return new RoadLogistics().planDelivery(product);
  }

}
