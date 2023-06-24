package TP6;

import java.util.ArrayList;
import java.util.Scanner;

class Pc {
  private String name;
  private boolean isDam;

  Pc(String name, boolean isdam) {
    this.name = name;
    this.isDam = isdam;
  }

  public String getName() {
    return name;
  }

  public boolean isDam() {
    return isDam;
  }

}// programe to manage PCS in room 306f of DICE

public class ex3 {

  static ArrayList<Pc> PC = new ArrayList<Pc>();

  public ex3() {

  }

  public void LisrPc() {
    System.out.println("List all pcs:");
    for (Pc pc : PC) {
      System.out.println(pc.getName());
    }
  }

  public void ListDamPc() {
    System.out.println("Damaged Pcs:");
    for (Pc pc : PC) {
      if (pc.isDam()) {
        System.out.println(pc.getName());
      }
    }
  }

  public void ListGood() {
    System.out.println("List Good Pcs:");
    for (Pc pc : PC) {
      if (!pc.isDam()) {
        System.out.println(pc.getName());
      }
    }
  }

  public static void main(String[] args) {
    ex3 PM = new ex3();
    // initialize array of 10 pcs
    for (int i = 0; i < 10; i += 2) {
      PC.add(new Pc("PC " + Integer.toString(i), true));
      PC.add(new Pc("PC " + Integer.toString(i + 1), false));

    }
    Scanner input = new Scanner(System.in);
    int ch = 1;
    while (ch != 6) {
      // Display menu
      System.out.println("\nMenu:");
      System.out.println("1. List all PCs");
      System.out.println("2. List all damaged PCs");
      System.out.println("3. List all good PCs");
      System.out.println("4. Mark a PC as damaged");
      System.out.println("5. Mark a PC as not damaged");
      System.out.println("6. Quit");

      // get userinput
      System.out.println("enter menu choise: ");
      ch = input.nextInt();
      switch (ch) {
        case 1:
          PM.LisrPc();
          break;
        case 2:
          PM.ListDamPc();
          break;
        case 3:
          PM.ListGood();
          break;
        case 4:
          System.out.println("Enter index of PC to mark as damaged.");
          int PcInexToDam = input.nextInt() - 1;
          PC.set(PcInexToDam, new Pc(Integer.toString(+1), true));
          break;
        case 5:
          System.out.println("Enter index of PC to mark as nor damaged (1-10):");
          int nk = input.nextInt() - 1;
          PC.set(nk, new Pc(Integer.toString(nk + 1), false));
          break;
        case 6:
          System.out.println("Exiting program.");
          System.exit(0);
        default:
          System.out.println("invalid menu choise.");
      }
    }
    input.close();
  }
}
