package TP3;

import java.util.Scanner;

public class ex4 {
  public static void main(String[] args) {
    Scanner var = new Scanner(System.in);
    System.out.println("Program for converting money in Riels to Dollars.");
    System.out.println("Conversion rate is : 1 USD = 4000 Riels");
    System.out.println("Please input money in Riels:");
    int a = var.nextInt();
    float b, c = 4000;
    b = a / c;

    System.out.println(a + " Riels =" + b);
  }
}
