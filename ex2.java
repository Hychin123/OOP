package TP4;

import java.util.Scanner;

public class ex2 {
  public static void main(String[] args) {
    Scanner var = new Scanner(System.in);
    System.out.println("Program for testing numer.");
    System.out.println("Please input 6 digits number:");
    LuckyNumber luckyNumber = new LuckyNumber(var.nextInt());

    if (!luckyNumber.isValid(6)) {
      System.out.println("\nErr0r: Invalid input number, please input only 6 digits number.");
    } else if (luckyNumber.isLucky()) {
      System.out.println("\n" + luckyNumber.amount + " is lucky number.");
    } else {
      System.out.println("\n" + luckyNumber.amount + " is not lucky number.");
    }
    System.out.println("=================================================");
  }
}
