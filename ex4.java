package TP4;

import java.util.Scanner;

public class ex4 {
  public static void main(String[] args) {
    int a;
    do {
      System.out.println("Welcone to program Money Exchange!");
      System.out.println("1. Riels to Dollar.");
      System.out.println("2. Riels to Thai Baht.");
      System.out.println("3. Dolla to Riels.");
      System.out.println("4. Dolla to Thai Baht.");
      System.out.println("5. Thai Baht to Riels.");
      System.out.println("6. Exit");

      System.out.println("Choose an option:");
      Scanner var = new Scanner(System.in);
      a = var.nextInt();
      double change, r;
      switch (a) {
        case 1:
          System.out.println("Input money in Riels:");
          r = var.nextInt();
          change = r / 4000;
          System.out.println(r + " Riels = " + change);
          break;
        case 2:
          System.out.println("Input money in Riels:");
          r = var.nextInt();
          change = r * 0.008;
          System.out.println(r + " Riels =" + change + "Baht");
          break;
        case 3:
          System.out.println("Input money in Dollar:");
          r = var.nextInt();
          change = r * 4000;
          System.out.println(r + " Dollar =" + change + "Riels");
          break;
        case 4:
          System.out.println("Input money in Dollar:");
          r = var.nextInt();
          change = r * 0.008;
          System.out.println(r + "Dollar =" + change + "Baht");
          break;
        case 5:
          System.out.println("Input money in Baht:");
          r = var.nextInt();
          change = r / 0.008;
          System.out.println(r + "Baht =" + change + "Baht");
          break;
      }
    } while (a != 0);

  }

}
