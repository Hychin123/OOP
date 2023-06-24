package TP4;

import java.util.Scanner;

public class option {
  public static void main(String[] args) {
    int c;
    Scanner var = new Scanner(System.in);
    do {
      System.out.println("\n----- Menu -----");
      System.out.println("1. Prime number.");
      System.out.println("2. Lucky number.");
      System.out.println("3. Reversing number.");
      System.out.println("4. Money change.");
      System.out.println("5. Max among 8 number");
      System.out.println("6. Shipping.");
      System.out.println("7. Leap year");
      System.out.println("0. Exit.");
      System.out.println("Choose the option:");
      c = var.nextInt();
      var.nextLine();
      switch (c) {
        case 1:
          TP4.ex1.main(null);
          break;
        case 2:
          TP4.ex2.main(null);
          break;
        case 3:
          TP4.ex3.main(null);
          break;
        case 4:
          TP4.ex4.main(null);
          break;
        case 5:
          TP4.ex5.main(null);
          break;
        case 6:
          TP4.ex6.main(null);
          break;
        case 7:
          TP4.ex7.main(null);
          break;
      }
    } while (c != 0);
    var.close();
  }
}
