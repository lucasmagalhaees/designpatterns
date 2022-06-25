package com.lucasbarbosa.designpattern.creationalpatterns.builder.driver;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Engine {

  private EngineType engineType;

  private boolean hasEletronicInjection;

  public static Engine mountEngine(EngineType engineType, boolean hasEletronicInjection){
    return new Engine(engineType, hasEletronicInjection);
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
        .append("type", engineType)
        .append("eletronicInjection", hasEletronicInjection)
        .toString();
  }

}
