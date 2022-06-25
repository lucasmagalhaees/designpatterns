package com.lucasbarbosa.designpattern.creationalpatterns.abstractfactory.model.furniture.italian;

import com.lucasbarbosa.designpattern.creationalpatterns.abstractfactory.interfaces.Sofa;
import com.lucasbarbosa.designpattern.creationalpatterns.abstractfactory.model.furniture.french.FrenchSofa;

public class ItalianSofa extends Sofa {

  private ItalianSofa(Integer seatsNumber, boolean hasBraces) {
    super(seatsNumber, hasBraces);
  }

  public static ItalianSofa create(Integer seatsNumber, boolean hasBraces){
    return new ItalianSofa(seatsNumber, hasBraces);
  }
}
