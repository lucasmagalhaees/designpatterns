package com.lucasbarbosa.designpattern.creationalpatterns.abstractfactory.model.furniture.french;

import com.lucasbarbosa.designpattern.creationalpatterns.abstractfactory.interfaces.Table;

public class FrenchTable extends Table {

  private FrenchTable(Integer legsNumber, Integer seatsNumber) {
    super(legsNumber, seatsNumber);
  }

  public static FrenchTable create(Integer legsNumber, Integer seatsNumber){
    return new FrenchTable(legsNumber, seatsNumber);
  }


}
