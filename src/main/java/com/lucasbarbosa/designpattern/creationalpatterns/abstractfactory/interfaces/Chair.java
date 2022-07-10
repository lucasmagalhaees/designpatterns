package com.lucasbarbosa.designpattern.creationalpatterns.abstractfactory.interfaces;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Getter
@Setter
public abstract class Chair {

  private Integer legsNumber;

  private boolean hasBraces;

  protected Chair(Integer legsNumber, boolean hasBraces) {
    this.legsNumber = legsNumber;
    this.hasBraces = hasBraces;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
        .append("legs", legsNumber)
        .append("braces", hasBraces)
        .toString();
  }
}
