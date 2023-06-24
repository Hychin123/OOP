package TP3;

import java.util.Scanner;

public class ex3 {
  public static void main(String[] args) {
    Scanner var = new Scanner(System.in);
    System.out.println("Program for converting time to seconds.");
    System.out.println("Please input hours :");
    int a = var.nextInt();
    System.out.println("Please inpute minutes :");
    int b = var.nextInt();
    System.out.println("Please input seconds:");
    int c = var.nextInt();

    System.out.println("Program for converting time to seconds.");
    System.out.println("Please input end hours :");
    int x = var.nextInt();
    System.out.println("Please inpute end minutes :");
    int y = var.nextInt();
    System.out.println("Please input end seconds:");
    int z = var.nextInt();

    int first = a * 3600 + b * 60 + c;
    int end = x * 3600 + y * 60 + z;
    int total = end - first;
    int h = total / 3600;
    int m = (total % 3600) / 60;
    int s = total / 60;
    double cost = (0.05 / 60) * total;
    System.out.println("Total call duration :" + h + "h" + m + "mn" + s + "s");
    System.out.println("Total of cost is :" + cost + "$");
  }

}
