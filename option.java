package TP3;

import java.util.Scanner;

public class option {
  public static void main(String[] args) {
    int c;
    Scanner var = new Scanner(System.in);
    do {
      System.out.println("\n----- Menu -----");
      System.out.println("1. Seconds to time.");
      System.out.println("2. Time to Seconds.");
      System.out.println("3. Calling Cost.");
      System.out.println("4. Riels to Dollar.");
      System.out.println("5. Traveling Duration");
      System.out.println("0. Exit.");
      System.out.println("Choose the option:");
      c = var.nextInt();
      var.nextLine();
      switch (c) {
        case 1:
          TP3.ex1.main(null);
          break;
        case 2:
          TP3.ex2.main(null);
          break;
        case 3:
          TP3.ex3.main(null);
          break;
        case 4:
          TP3.ex4.main(null);
          break;
        case 5:
          TP3.ex5.main(null);
          break;
      }
    } while (c != 0);
    var.close();
  }
}
