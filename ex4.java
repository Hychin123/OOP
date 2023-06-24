package TP5;

import java.util.Scanner;

public class ex4 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    // double[] a = new double[12];
    double Total = 0;
    for (int i = 1; i <= 12; i++) {

      System.out.println("profit for month " + i + ":");
      // a[i] = input.nextDouble();
      Double a = input.nextDouble();
      Total += a;
    }
    System.out.println("Total of profit 12 month: " + Total);

  }
}