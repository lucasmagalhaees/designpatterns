package com.lucasbarbosa.designpattern.creationalpatterns.prototype.model;

import static org.apache.commons.lang3.StringUtils.EMPTY;

import com.lucasbarbosa.designpattern.creationalpatterns.prototype.drive.ColorEnum;
import com.lucasbarbosa.designpattern.creationalpatterns.prototype.interfaces.Shape;
import java.util.Random;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Circle extends Shape {

  private Integer radius;

  public Circle(Circle circle) {
    super(circle);
    this.radius = circle.getRadius();
  }

  public static Circle build() {
    var circle = new Circle();
    circle.setColor(ColorEnum.fetchRandomColor().orElse(EMPTY));
    circle.setX(new Random().nextInt(5));
    circle.setY(new Random().nextInt(5));
    return circle;
  }

  @Override
  public Shape cloneShape() {
    return new Circle(this);
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
        .append("color", this.getColor())
        .append("X", this.getX())
        .append("Y", this.getY())
        .toString();
  }
}
