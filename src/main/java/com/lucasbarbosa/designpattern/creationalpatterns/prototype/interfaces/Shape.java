package com.lucasbarbosa.designpattern.creationalpatterns.prototype.interfaces;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public abstract class Shape {

  private Integer x;

  private Integer y;

  private String color;

  protected Shape(Shape shape) {
    this.x = shape.getX();
    this.y = shape.getY();
    this.color = shape.getColor();
  }

  public abstract Shape cloneShape();
}
