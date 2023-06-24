package TP5;

import java.util.Scanner;

public class ex6 {
  public static String Palindrome(String str) {
    // create a string builder object to store the revers copies og the string to
    // form a palindrome
    StringBuilder reverse = new StringBuilder(str);
    reverse.reverse();
    // join the original and reverse copies of the string to form a palindrome
    StringBuilder drome = new StringBuilder(str);
    drome.append(reverse);
    return drome.toString();
  }

  /*
   * public static String reverStr(String str) {
   * StringBuilder reverse = new StringBuilder(str);
   * reverse.reverse();
   * return reverse.toString();
   * }
   */

  public static void main(String[] args) {
    String str;
    Scanner input = new Scanner(System.in);
    System.out.println("Input the word:");
    str = input.next();
    String drome = Palindrome(str);
    // String reverse = reverStr(str); reverse word ex; hello => olleh

    System.out.println("Palindrome:" + drome);
    // System.out.println("Reverse:"+ reverse );
  }

}
