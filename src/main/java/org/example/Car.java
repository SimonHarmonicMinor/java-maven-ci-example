package org.example;

public class Car implements Vehicle {
  private final String brand;
  private final int year;
  private final String color;

  public Car(String brand, int year, String color) {
    this.brand = brand;
    this.year = year;
    this.color = color;
  }

  @Override
  public void print() {
    System.out.println("Бренд: " + this.brand);
    System.out.println("Год выпуск: " + this.year);
    System.out.println("Цвет: " + this.color);
  }

  @Override
  public String toString() {
    return String.format("Car[brand=%s, year=%d, color=%s]", this.brand, this.year, this.color);
  }
}
