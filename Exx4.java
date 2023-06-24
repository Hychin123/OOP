package TP5;

import java.util.Scanner;

public class Exx4 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double[] profits = new double[12];
    double totalProfit = 0;

    for (int i = 0; i < 12; i++) {
      System.out.print("Enter the profit for month " + (i + 1) + ": ");
      profits[i] = input.nextDouble();
      totalProfit += profits[i];
    }

    System.out.println("The total profit for the year is " + totalProfit);
  }
}
