package TP5;

import java.util.Scanner;
import TP4.ex1;

public class Exx1 {
  private int start = 2;
  private int end;

  public Exx1(int end) {
    this.end = end;
  }

  public void lissAll() {
    ex1 pn;
    int cound = 0;
    for (int n = start; n <= end; n++) {
      pn = new ex1(n);
      if (pn.isPrime()) {
        System.out.println(n + " ");
        cound++;
      }
    }
    if (cound == 1) {
      System.out.println("is prime number.");
    } else if (cound > 1) {
      System.out.println("are prime number.");
    } else {
      System.out.println("no prime number.");
    }
  }

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("input to list prine number from 2 to it:");
    Exx1 pl = new Exx1(input.nextInt());
    pl.lissAll();
    input.close();
  }
}
