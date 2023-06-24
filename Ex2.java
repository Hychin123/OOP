package TP2;

import java.util.Scanner;

public class Ex2 {
  public static void main(String[] args) {
    Scanner var = new Scanner(System.in);
    System.out.println("Program for calculating perimeter and surface of a Rectangle:");
    System.out.print("Please Input width(in meter):");
    int a = var.nextInt();
    System.out.print("Please Input height(in meter):");
    int b = var.nextInt();
    int c, d;
    c = (a + b) * 2;
    d = (a * b);
    System.out.println("Periemter =" + c + " m");
    System.out.println("Surface :" + d + " m^2 ");
    var.close();
  }
}
