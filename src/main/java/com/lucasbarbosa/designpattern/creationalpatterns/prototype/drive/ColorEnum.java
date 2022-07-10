package com.lucasbarbosa.designpattern.creationalpatterns.prototype.drive;

import java.util.Arrays;
import java.util.Optional;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public enum ColorEnum {
  RED,
  YELLOW,
  GREEN,
  BLUE,
  BLACK,
  WHITE;

  public static Optional<String> fetchRandomColor() {
    return Arrays.stream(ColorEnum.values()).map(Enum::name).findAny();
  }
}
