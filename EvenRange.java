package TP5;

import java.util.Scanner;

public class EvenRange {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("enter the number:");
    int a = input.nextInt();
    RangeUtil rg = new RangeUtil(2, a, 2);
    System.out.println("Odd number from 1 to " + a + " :" + rg.toString());
  }
}