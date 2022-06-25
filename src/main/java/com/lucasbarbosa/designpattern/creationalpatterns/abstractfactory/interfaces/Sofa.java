package com.lucasbarbosa.designpattern.creationalpatterns.abstractfactory.interfaces;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Getter
@Setter
public abstract class Sofa {

  private Integer seatsNumber;

  private boolean hasBraces;

  protected Sofa(Integer seatsNumber, boolean hasBraces) {
    this.seatsNumber = seatsNumber;
    this.hasBraces = hasBraces;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
        .append("seats", seatsNumber)
        .append("braces", hasBraces)
        .toString();
  }

}

