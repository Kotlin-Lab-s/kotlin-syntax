package com.study.lec01;

import java.util.Arrays;
import java.util.List;

public class Lec01Main {

  public static void main(String[] args) {
    long number1 = 10L; // (1)
    final long number2 = 10L; // (2)

    Long number3 = 1_000L; // (3)
    Person person = new Person("최태현"); // (4)

    List<Integer> nubmers = Arrays.asList(1, 2, 3, 4, 5); // (5)
    nubmers.add(6); // (6)
  }

}
