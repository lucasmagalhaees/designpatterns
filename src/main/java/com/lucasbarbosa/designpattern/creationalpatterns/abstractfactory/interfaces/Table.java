package com.lucasbarbosa.designpattern.creationalpatterns.abstractfactory.interfaces;


import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Getter
@Setter
public abstract class Table {

  private Integer legsNumber;

  private Integer seatsNumber;

  protected Table(Integer legsNumber, Integer seatsNumber) {
    this.legsNumber = legsNumber;
    this.seatsNumber = seatsNumber;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
        .append("legs", legsNumber)
        .append("seats", seatsNumber)
        .toString();
  }
}
