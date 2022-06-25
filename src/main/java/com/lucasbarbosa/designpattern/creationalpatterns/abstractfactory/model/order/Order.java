package com.lucasbarbosa.designpattern.creationalpatterns.abstractfactory.model.order;

import com.lucasbarbosa.designpattern.creationalpatterns.abstractfactory.interfaces.Chair;
import com.lucasbarbosa.designpattern.creationalpatterns.abstractfactory.interfaces.Sofa;
import com.lucasbarbosa.designpattern.creationalpatterns.abstractfactory.interfaces.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Order {

  private Chair chair;
  private Sofa sofa;
  private Table table;

  public static Order create(Chair chair, Sofa sofa, Table table){
    return new Order(chair, sofa, table);
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
        .append("chair", chair)
        .append("sofa", sofa)
        .append("table", table)
        .toString();
  }

}
