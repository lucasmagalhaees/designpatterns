package com.lucasbarbosa.designpattern.creationalpatterns.factorymethod.interfaces;

import com.lucasbarbosa.designpattern.creationalpatterns.factorymethod.driver.EnvironmentEnum;
import com.lucasbarbosa.designpattern.creationalpatterns.factorymethod.driver.Product;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Getter
@Setter
public abstract class Transport {

  private String cargoNumber;
  private String vehicle;
  private EnvironmentEnum environment;
  protected Transport(
      EnvironmentEnum environment) {
    this.environment = environment;
    setVehicle(this.getClass().getSimpleName());
  }

  public abstract void deliver(Product product);

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
        .append("env", environment)
        .append("vehicle", vehicle)
        .toString();
  }

}
