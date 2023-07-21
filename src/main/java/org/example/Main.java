package org.example;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Main {

  public static void main(String[] args) {
    Map<Integer, String> map = new HashMap<>();
    map.put(1, "Bob");
    map.put(2, "Alice");
    System.out.println(map);
  }

  private static void printInt(int value) {
    System.out.println(value);
  }
}
