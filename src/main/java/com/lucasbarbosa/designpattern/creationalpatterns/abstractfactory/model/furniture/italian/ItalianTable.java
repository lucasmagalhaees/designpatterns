package com.lucasbarbosa.designpattern.creationalpatterns.abstractfactory.model.furniture.italian;

import com.lucasbarbosa.designpattern.creationalpatterns.abstractfactory.interfaces.Table;

public class ItalianTable extends Table {

  private ItalianTable(Integer legsNumber, Integer seatsNumber) {
    super(legsNumber, seatsNumber);
  }

  public static ItalianTable create(Integer legsNumber, Integer seatsNumber) {
    return new ItalianTable(legsNumber, seatsNumber);
  }

}
