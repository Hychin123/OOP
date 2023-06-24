package TP5;

import java.util.Scanner;

public class ex3 {
  public static void main(String[] args) {
    int a;
    Scanner input = new Scanner(System.in);
    System.out.println("Inpute number:");
    a = input.nextInt();
    if (0 <= a || a >= 500) {
      System.out.println("even number of " + a + " to 500 is:");
      for (int i = a; i <= 500; i += 2) {
        System.out.println(i + " ");
      }
    }
  }
}
