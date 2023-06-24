package TP5;

import java.util.Scanner;

public class ex5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a string to check for palindrome:");
    String inputString = scanner.nextLine();
    System.out.println("Choose a method for checking palindrome:");
    System.out.println("1. Iterating through characters");
    System.out.println("2. Using StringBuilder");
    int choice = scanner.nextInt();
    boolean isPalindrome = false;
    switch (choice) {
      case 1:
        isPalindrome = checkIterating(inputString);
        break;
      case 2:
        isPalindrome = checkBuilder(inputString);
        break;
      default:
        System.out.println("Invalid choice");
        break;
    }
    if (isPalindrome) {
      System.out.println(inputString + " is a palindrome");
    } else {
      System.out.println(inputString + " is not a palindrome");
    }
  }

  private static boolean checkIterating(String inputString) {
    int length = inputString.length();
    for (int i = 0; i < length / 2; i++) {
      if (inputString.charAt(i) != inputString.charAt(length - i - 1)) {
        return false;
      }
    }
    return true;
  }

  private static boolean checkBuilder(String inputString) {
    StringBuilder stringBuilder = new StringBuilder(inputString);
    return inputString.equals(stringBuilder.reverse().toString());
  }
}
