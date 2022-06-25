package com.lucasbarbosa.designpattern.creationalpatterns.factorymethod.interfaces;

import com.lucasbarbosa.designpattern.creationalpatterns.factorymethod.driver.Product;

public interface Logistics {

  Transport createTransport(Product product);

  default Transport planDelivery(Product product) {
    var transport = createTransport(product);
    transport.deliver(product);
    return transport;
  }

}
