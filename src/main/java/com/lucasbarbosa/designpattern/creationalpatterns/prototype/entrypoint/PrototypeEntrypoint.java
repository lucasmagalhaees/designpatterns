package com.lucasbarbosa.designpattern.creationalpatterns.prototype.entrypoint;

import com.lucasbarbosa.designpattern.creationalpatterns.prototype.interfaces.Shape;
import com.lucasbarbosa.designpattern.creationalpatterns.prototype.model.Circle;
import com.lucasbarbosa.designpattern.creationalpatterns.prototype.model.Rectangle;
import com.lucasbarbosa.designpattern.creationalpatterns.prototype.usecase.ShapeRegistry;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PrototypeEntrypoint {

  public static void main(String[] args) {
    Circle circle = Circle.build();
    Rectangle rectangle = Rectangle.build();
    List<Shape> shapes = List.of(circle, rectangle);
    ShapeRegistry shapeRegistry = new ShapeRegistry();
    for(Shape shape : shapes){
      shapeRegistry.addItem(shape.cloneShape());
    }
    log.info("shapes are {}", shapes);
    log.info("shape registry is {}", shapeRegistry.getItems());
  }

}
