package TP5;

import java.util.Scanner;

public class Message {
  public String strings;

  public String encoder(String strings) {
    strings = strings.replace("\\n", "(new_line)");
    strings = strings.replace("\\t", "(tab)");
    strings = strings.replace("\\\\", "slash");

    strings = strings.replace("//", "(comment_line)");
    strings = strings.replace(":)", "(smile)");
    return strings;
  }

  public String decoder(String string) {
    strings = strings.replace("(new_line)", "\\n");
    strings = strings.replace("(tab)", "\\t");
    strings = strings.replace("(slash)", "\\");
    strings = strings.replace("(comment_line)", "//");
    strings = strings.replace("(smile)", ":)");
    return strings;
  }

  public static void main(String[] args) {
    System.out.println("1. Text Encoder.");
    System.out.println("2. Text Decoder.");
    int ch;
    String strings;
    Scanner input = new Scanner(System.in);
    Message mes = new Message();
    System.out.println("Input the choise:");
    ch = input.nextInt();
    do {
      switch (ch) {
        case 0:
          System.out.println("try again.");
          break;
        case 1:
          System.out.println("input Message:");
          input.nextLine();
          strings = input.nextLine();
          System.out.println("\nEncoder:" + mes.encoder(strings));
          break;
        case 2:
          System.out.println("input Message:");
          input.nextLine();
          strings = input.nextLine();
          System.out.println("\ndecoder:" + mes.decoder(strings));
          break;
      }

    } while (ch != 0);
  }
}
