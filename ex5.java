package TP3;

import java.util.Scanner;

public class ex5 {
  public static void main(String[] args) {
    Scanner var = new Scanner(System.in);
    System.out.println("Program for calculating duration of travel from ITC to Airport.");
    System.out.println("Please input traffic jam factor (in percentage [1-100]):");
    int c = var.nextInt();
    int d = 7;
    double p = c * 0.00833333 / 100;
    int t = (int) (d / p);
    int s = t % 60;
    int h = t / 60;
    int m = h % 60;
    h = h / 60;
    System.out.println("Travelling Duration =" + h + ":" + m + ":" + s);
  }
}
