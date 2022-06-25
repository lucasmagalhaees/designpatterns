package com.lucasbarbosa.designpattern.creationalpatterns.factorymethod.entrypoint;

import com.lucasbarbosa.designpattern.creationalpatterns.factorymethod.converter.FactoryConverter;
import com.lucasbarbosa.designpattern.creationalpatterns.factorymethod.driver.Product;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FactoryEntrypoint {

  public static void main(String[] args) {
    Product productOne = Product.build();
    Product productTwo = Product.build();
    log.info("productOne is {}", productOne);
    log.info("productTwo is {}", productTwo);
    var roadLogistics = FactoryConverter.convert(productOne);
    var seaLogistics = FactoryConverter.convert(productTwo);
    log.info("productOne goes by {}", roadLogistics);
    log.info("productTwo goes by {}", seaLogistics);
  }

}
