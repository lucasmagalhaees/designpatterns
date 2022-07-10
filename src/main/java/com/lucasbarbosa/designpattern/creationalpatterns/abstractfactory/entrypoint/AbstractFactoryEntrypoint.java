package com.lucasbarbosa.designpattern.creationalpatterns.abstractfactory.entrypoint;

import com.lucasbarbosa.designpattern.creationalpatterns.abstractfactory.converter.AbstractFactoryConverter;
import com.lucasbarbosa.designpattern.creationalpatterns.abstractfactory.model.order.Order;
import com.lucasbarbosa.designpattern.creationalpatterns.abstractfactory.usecase.FrenchFurnitureFactory;
import com.lucasbarbosa.designpattern.creationalpatterns.abstractfactory.usecase.ItalianFurnitureFactory;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AbstractFactoryEntrypoint {

  public static void main(String[] args) {
    Order frenchOrder = AbstractFactoryConverter.convert(new FrenchFurnitureFactory());
    Order italianOrder = AbstractFactoryConverter.convert(new ItalianFurnitureFactory());

    log.info("French ordered {}", frenchOrder);
    log.info("Italian ordered {}", italianOrder);
  }
}
