package TP3;

import java.util.Scanner;

public class ex2 {
  public static void main(String[] args) {
    Scanner var = new Scanner(System.in);
    System.out.println("Program for converting time to seconds.");
    System.out.println("Please input hours :");
    int a = var.nextInt();
    System.out.println("Please inpute minutes :");
    int b = var.nextInt();
    System.out.println("Please input seconds:");
    int c = var.nextInt();

    a = a * 3600;
    b = b * 60;
    int sum;
    sum = a + b + c;
    System.out.println("Number of seconds = " + a + "+" + b + "+" + c + "=" + sum);
  }
}
