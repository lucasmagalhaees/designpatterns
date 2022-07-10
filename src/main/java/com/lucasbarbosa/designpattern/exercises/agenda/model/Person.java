package com.lucasbarbosa.designpattern.exercises.agenda.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Person {
  private Integer code;
  private String name;
  private String phoneNumber;

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
        .append("code", code)
        .append("name", name)
        .append("phone", phoneNumber)
        .toString();
  }
}
