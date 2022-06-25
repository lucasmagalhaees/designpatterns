package com.lucasbarbosa.designpattern.creationalpatterns.factorymethod.driver;

import java.util.Optional;
import java.util.Random;
import java.util.UUID;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Product {

  private String name;
  private boolean isHeavy;
  private boolean isFragile;

  public static Product build() {
    return new Product(UUID.randomUUID().toString(), new Random().nextBoolean(),
        new Random().nextBoolean());
  }

  public String emitFragileLabel() {
    return Optional.of(this.isFragile).filter(BooleanUtils::isTrue).map(value -> "FRAGILE").orElse(
        "RESILIENT");
  }
  public String emitHeavyLabel() {
    return Optional.of(this.isHeavy).filter(BooleanUtils::isTrue).map(value -> "HEAVYWEIGHT").orElse(
        "LIGHTWEIGHT");
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
        .append("heavy", emitHeavyLabel() )
        .append("fragile", emitFragileLabel())
        .toString();
  }

}
