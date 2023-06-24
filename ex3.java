package TP4;

import java.util.Scanner;

public class ex3 {
  public int resverseNumber(int num, int digits) {
    int resverseNum = 0;
    int n = digits;
    int a;
    for (int i = 0; i < digits; i++) {
      a = (int) Math.pow(10.00, (n - 1));
      resverseNum = resverseNum + (num % 10) * a;
      num /= 10;
      n--;
    }
    return resverseNum;
  }

  public static void main(String[] args) {
    int number, reverseNumber;
    ex3 k = new ex3();
    LuckyNumber luckyNumber;
    Scanner war = new Scanner(System.in);
    System.out.println("====== ex3 =======");
    System.out.println("Program for reversing a 4 digits number");
    System.out.print("Please input 4 digits number: ");
    number = war.nextInt();
    luckyNumber = new LuckyNumber(number);

    if (!luckyNumber.isValid(4)) {
      System.out.println("\nError: Invalid input number, please input only 4 digits number.");
    } else {
      reverseNumber = k.resverseNumber(number, 4);
      System.out.println("\nAfter resverse: " + reverseNumber);
    }
    System.out.println("================");
  }

}
