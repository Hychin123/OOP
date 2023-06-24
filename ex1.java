package TP6;

import java.util.Scanner;

class Point {
  private int x;
  private int y;

  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int getX() {
    return x;
  }

  public int getY() {
    return y;
  }
}

public class ex1 {
  private Point center;
  private Point pointOnCircle;

  public ex1(Point center, Point pointOnCircle) {
    this.center = center;
    this.pointOnCircle = pointOnCircle;
  }

  public double length() {
    double radius = radius();
    return 2 * Math.PI * radius;
  }

  public double radius() {
    int dx = center.getX() - pointOnCircle.getX();
    int dy = center.getY() - pointOnCircle.getY();
    return Math.sqrt(dx * dx + dy * dy);
  }

  public double surface() {
    double radius = radius();
    return Math.PI * radius * radius;
  }

  public static void main(String[] args) {
    Scanner var = new Scanner(System.in);
    System.out.println("input x:");
    int x = var.nextInt();
    System.out.println("input y:");
    int y = var.nextInt();
    System.out.println("sum :" + x + y);
    var.close();
  }
}
