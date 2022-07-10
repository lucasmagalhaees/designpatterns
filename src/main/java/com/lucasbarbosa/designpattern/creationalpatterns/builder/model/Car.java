package com.lucasbarbosa.designpattern.creationalpatterns.builder.model;

import com.lucasbarbosa.designpattern.creationalpatterns.builder.driver.Engine;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public abstract class Car {

  private Integer seats;

  private Engine engine;

  private boolean hasTripComputer;

  private boolean hasGPS;

  public abstract Car reset();

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
        .append("seats", seats)
        .append("engine", engine)
        .append("tripComputer", hasTripComputer)
        .append("GPS", hasGPS)
        .toString();
  }
}
