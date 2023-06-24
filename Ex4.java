package TP2;

import java.util.Scanner;

public class Ex4 {
  public static void main(String[] args) {
    Scanner var = new Scanner(System.in);
    System.out.println("Program for guessing your luckiness.");
    System.out.println("Please input a positive number:");
    int a = var.nextInt();
    int b;
    b = a + 1;

    System.out.println("I got " + b + ". I am luckier.");

    var.close();
  }

}
