package com.lucasbarbosa.designpattern.creationalpatterns.abstractfactory.interfaces;

import com.lucasbarbosa.designpattern.creationalpatterns.abstractfactory.model.order.Order;

public interface FurnitureFactory {

  Chair createChair();

  Table createTable();

  Sofa createSofa();

  default Order buildOrder(){
    return Order.create(createChair(),createSofa(), createTable());
  }

}
