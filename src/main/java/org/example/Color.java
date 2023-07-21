package org.example;

public enum Color {
  WHITE("белый"), BLUE("синий");

  private final String rus;

  Color(String rus) {
    this.rus = rus;
  }

  public String getRus() {
    return rus;
  }
}
