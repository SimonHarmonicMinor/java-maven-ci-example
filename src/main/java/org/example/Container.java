package org.example;

public class Container {

  private final Car value;

  public Container(Car value) {
    this.value = value;
  }

  public boolean isPresent() {
    return value != null;
  }

  public void print() {
    if (isPresent()) {
      System.out.println("Container value is: " + value);
    } else {
      System.out.println("Container is empty");
    }
  }

  public Car getValue() {
    return value;
  }
}
