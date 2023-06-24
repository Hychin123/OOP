package TP3;

import java.util.Scanner;

public class ex1 {
  public static void main(String[] args) {
    Scanner var = new Scanner(System.in);
    System.out.println("Input number of seconds:");
    int a = var.nextInt();
    int hours, seconds, minute;
    seconds = a % 60;
    hours = a / 60;
    minute = hours % 60;
    hours = hours / 60;
    System.out.printf("Time corresponding to %d seconds is  " + hours + ":" + minute + ":" + seconds, a);
  }
}
