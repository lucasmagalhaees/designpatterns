package com.lucasbarbosa.designpattern.creationalpatterns.abstractfactory.usecase;

import com.lucasbarbosa.designpattern.creationalpatterns.abstractfactory.interfaces.Chair;
import com.lucasbarbosa.designpattern.creationalpatterns.abstractfactory.interfaces.FurnitureFactory;
import com.lucasbarbosa.designpattern.creationalpatterns.abstractfactory.interfaces.Sofa;
import com.lucasbarbosa.designpattern.creationalpatterns.abstractfactory.interfaces.Table;
import com.lucasbarbosa.designpattern.creationalpatterns.abstractfactory.model.furniture.french.FrenchChair;
import com.lucasbarbosa.designpattern.creationalpatterns.abstractfactory.model.furniture.french.FrenchSofa;
import com.lucasbarbosa.designpattern.creationalpatterns.abstractfactory.model.furniture.french.FrenchTable;

public class FrenchFurnitureFactory implements FurnitureFactory {

  @Override
  public Chair createChair() {
    return FrenchChair.create(2, true);
  }

  @Override
  public Table createTable() {
    return FrenchTable.create(2,2);
  }

  @Override
  public Sofa createSofa() {
    return FrenchSofa.create(2, true);
  }
}
