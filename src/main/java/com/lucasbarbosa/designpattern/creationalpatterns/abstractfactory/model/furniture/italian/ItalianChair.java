package com.lucasbarbosa.designpattern.creationalpatterns.abstractfactory.model.furniture.italian;

import com.lucasbarbosa.designpattern.creationalpatterns.abstractfactory.interfaces.Chair;

public class ItalianChair extends Chair {

  private ItalianChair(Integer legsNumber, boolean hasBraces) {
    super(legsNumber, hasBraces);
  }

  public static ItalianChair create(Integer legsNumber, boolean hasBraces) {
    return new ItalianChair(legsNumber, hasBraces);
  }
}
