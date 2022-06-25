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
public class Rectangle extends Shape {

  private Integer width;

  private Integer height;

  public Rectangle(Rectangle rectangle) {
    super(rectangle);
    this.width = rectangle.getWidth();
    this.height = rectangle.getHeight();
  }

  public static Rectangle build() {
    var rectangle = new Rectangle();
    rectangle.setColor(ColorEnum.fetchRandomColor().orElse(EMPTY));
    rectangle.setX(new Random().nextInt(5));
    rectangle.setY(new Random().nextInt(5));
    return rectangle;
  }

  @Override
  public Shape cloneShape() {
    return new Rectangle(this);
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
