package TP2;

import java.util.Scanner;

public class Ex1 {
  public static void main(String[] args) {
    Scanner var = new Scanner(System.in);
    System.out.println("Welcome to EX1:");
    System.out.print("Input your name :");
    String a = var.nextLine();

    System.out.println("Hello " + a);
    var.close();
  }
}