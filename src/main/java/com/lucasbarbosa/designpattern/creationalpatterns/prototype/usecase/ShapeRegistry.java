package com.lucasbarbosa.designpattern.creationalpatterns.prototype.usecase;

import com.lucasbarbosa.designpattern.creationalpatterns.prototype.interfaces.Shape;
import java.util.HashMap;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ShapeRegistry {

  private HashMap<String, Shape> items = new HashMap<>();

  public void addItem(Shape shape) {
    this.items.put(buildShapeId(shape), shape);
  }

  public void reset() {
    this.items = new HashMap<>();
  }


  private String buildShapeId(Shape shape) {
    return new StringBuilder().append(shape.getClass().getSimpleName())
        .append(shape.getColor())
        .append(shape.getX())
        .append(shape.getY())
        .toString();
  }

}
