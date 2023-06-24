package TP5;

import java.util.Scanner;

public class ex7 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("1. New line.");
    System.out.println("2. Tab.");
    System.out.println("3. Slash.");
    System.out.println("4. commit.");
    System.out.println("5. Smile");
    System.out.println("Input choise:");
    int ch = input.nextInt();
    input.nextLine();
    switch (ch) {
      case 1:
        System.out.println("Please enter a sentence:");
        String str = input.nextLine();
        String str1 = str.replaceAll("[\\\\]n", "New line");
        System.out.println(str1);
        break;
      case 2:
        System.out.println("Please enter a sentence:");
        String st = input.nextLine();
        String st1 = st.replaceAll("[\\\\]t", "tab");
        System.out.println(st1);
        break;
      case 3:
        System.out.println("Please enter a sentence:");
        String stn = input.nextLine();
        String stn1 = stn.replaceAll("[\\\\]", "slash");
        System.out.println(stn1);
        break;
      case 4:
        System.out.println("Please enter a sentence:");
        String s = input.nextLine();
        String s1 = s.replaceAll("[////]", "Comment");
        System.out.println(s1);
        break;
      case 5:
        System.out.println("Please enter a sentence:");
        String l = input.nextLine();
        String l1 = l.replaceAll(":[)]", "Smile");
        System.out.println(l1);
        break;
    }
  }
}
