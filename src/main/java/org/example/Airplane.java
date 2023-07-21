package org.example;

import java.util.Objects;

public class Airplane implements Vehicle {

  private final int year;
  private final String color;

  public Airplane(int year, String color) {
    if (color == null) {
      throw new IllegalArgumentException("Color cannot be null");
    }
    this.year = year;
    this.color = color;
  }

  public void print() {
    System.out.println("Год выпуска самолета: " + this.year);
    System.out.println("Цвет самолета: " + this.color);
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof Airplane airplane) {
      return year == airplane.year && Objects.equals(color, airplane.color);
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(year, color);
  }

  public Airplane withYear(int newYear) throws Exception {
    if (newYear < 0) {
      throw new RuntimeException("Year cannot be less than zero: " + newYear);
    }
    return new Airplane(newYear, this.color);
  }
}
