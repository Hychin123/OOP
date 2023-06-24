package TP4;

import java.util.Scanner;

public class ex1 {
  int num;
  int divisible;

  public ex1(int num) {
    this.num = num;
  }

  public boolean isPrime() {
    if (num <= 1) {
      return false;
    }
    for (int i = 2; i < num; i++) {
      if (num % i == 0) {
        divisible = i;
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    ex1 n;
    System.out.println("\tWelcome To Program For Check The Prime Number.");
    System.out.println("Please Enter Number To Check Whether It is Prime Number:");
    Scanner s = new Scanner(System.in);
    n = new ex1(s.nextInt());

    if (n.isPrime()) {
      System.err.printf(" %d is a prime number", n.num);
    } else {
      System.out.printf("%d is not a prime number, because it is divisible to %d  ", n.num, n.divisible);
    }
    s.close();
  }
}
