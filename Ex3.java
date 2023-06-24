package TP2;

import java.util.Scanner;

public class Ex3 {
  public static void main(String[] args) {
    Scanner var = new Scanner(System.in);
    System.out.println("Program for calculating equation 1/x = 1/y + 1/z");
    System.out.println("Please input y:");
    float a = var.nextFloat();
    System.out.println("Please input z:");
    float b = var.nextFloat();

    float c;
    c = 1 / (1 / a + 1 / b);

    System.out.println("Result x : " + c);
    var.close();
  }
}
