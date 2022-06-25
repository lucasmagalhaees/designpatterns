package com.lucasbarbosa.designpattern.creationalpatterns.abstractfactory.model.furniture.french;

import com.lucasbarbosa.designpattern.creationalpatterns.abstractfactory.interfaces.Sofa;

public class FrenchSofa extends Sofa {

  private FrenchSofa(Integer seatsNumber, boolean hasBraces) {
    super(seatsNumber, hasBraces);
  }

  public static FrenchSofa create(Integer seatsNumber, boolean hasBraces){
    return new FrenchSofa(seatsNumber, hasBraces);
  }
}
