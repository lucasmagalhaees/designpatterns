package com.lucasbarbosa.designpattern.creationalpatterns.abstractfactory.usecase;

import com.lucasbarbosa.designpattern.creationalpatterns.abstractfactory.interfaces.Chair;
import com.lucasbarbosa.designpattern.creationalpatterns.abstractfactory.interfaces.FurnitureFactory;
import com.lucasbarbosa.designpattern.creationalpatterns.abstractfactory.interfaces.Sofa;
import com.lucasbarbosa.designpattern.creationalpatterns.abstractfactory.interfaces.Table;
import com.lucasbarbosa.designpattern.creationalpatterns.abstractfactory.model.furniture.italian.ItalianChair;
import com.lucasbarbosa.designpattern.creationalpatterns.abstractfactory.model.furniture.italian.ItalianSofa;
import com.lucasbarbosa.designpattern.creationalpatterns.abstractfactory.model.furniture.italian.ItalianTable;

public class ItalianFurnitureFactory implements FurnitureFactory {

  @Override
  public Chair createChair() {
    return ItalianChair.create(4, false);
  }

  @Override
  public Table createTable() {
    return ItalianTable.create(4, 4);
  }

  @Override
  public Sofa createSofa() {
    return ItalianSofa.create(4, false);
  }
}
