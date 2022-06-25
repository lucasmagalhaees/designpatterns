package com.lucasbarbosa.designpattern.creationalpatterns.abstractfactory.converter;

import com.lucasbarbosa.designpattern.creationalpatterns.abstractfactory.interfaces.FurnitureFactory;
import com.lucasbarbosa.designpattern.creationalpatterns.abstractfactory.model.order.Order;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class AbstractFactoryConverter {

  public static Order convert(FurnitureFactory furnitureFactory) {
    return furnitureFactory.buildOrder();
  }

}
