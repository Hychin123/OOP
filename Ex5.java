package TP2;

import java.util.Scanner;

public class Ex5 {
  public static void main(String[] args) {
    Scanner var = new Scanner(System.in);
    System.out.println("Program for counting the number of hundreds.");
    System.out.println("Please input a positive number: ");
    int a = var.nextInt();
    int b;
    b = a / 100;
    System.out.println("There are " + b + " hundred in number " + a);
    var.close();
  }
}
