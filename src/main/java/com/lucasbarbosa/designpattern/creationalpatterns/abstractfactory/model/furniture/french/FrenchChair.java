package com.lucasbarbosa.designpattern.creationalpatterns.abstractfactory.model.furniture.french;

import com.lucasbarbosa.designpattern.creationalpatterns.abstractfactory.interfaces.Chair;

public class FrenchChair extends Chair {

  private FrenchChair(Integer legsNumber, boolean hasBraces) {
    super(legsNumber, hasBraces);
  }

  public static FrenchChair create(Integer legsNumber, boolean hasBraces) {
    return new FrenchChair(legsNumber, hasBraces);
  }
}
