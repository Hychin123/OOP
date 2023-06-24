package TP6;

import java.util.ArrayList;
import java.util.Scanner;

class Product {
  private String name;
  private double price;
  private int NumberP;
  private int StockA;

  Product(int NumberP, String name, double price, int StockA) {
    this.name = name;
    this.price = price;
    this.NumberP = NumberP;
    this.StockA = StockA;
  }

  public String toString() {
    return NumberP + ".   " + name + "     :   " + price + "$" + "    :   " + StockA;
  }
}

public class ex5 {
  public static void main(String[] args) {
    ArrayList<Product> pro = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    pro.add(new Product(1, "T-shirt", 22, 20));
    pro.add(new Product(2, "banana", 10, 100));
    pro.add(new Product(3, "fish", 15, 30));
    while (true) {
      System.out.println("""
          ============= List of Menu ==================
          1. List all products in shop with product number, name, price, and amount in stock
          2. Add new product to the list.
          3. Remove product from list by index.
          4. Update product index.
          5. exit.

          input the option:
            """);
      int ch = input.nextInt();
      input.nextLine();
      if (ch == 1) {
        System.out.println("List of product.");
        for (Product p : pro) {
          System.out.println(p);
        }
      } else if (ch == 2) {

        System.out.println("Enter number product :");
        int number = input.nextInt();
        input.nextLine();
        System.out.println("Entr your product: ");
        String name = input.nextLine();
        System.out.println("Enter your price :");
        double price = input.nextDouble();
        System.out.println("Enter your StockA :");
        int StockA = input.nextInt();

        pro.add(new Product(number, name, price, StockA));
        System.out.println("Succerfully !.");
      } else if (ch == 3) {
        System.out.println("Remove by index: ");
        int indexR = input.nextInt();
        if (indexR >= 0 && indexR <= pro.size()) {
          pro.remove(indexR);
          System.out.println("Product remove.");
        } else {
          System.out.println("Invilid index.");
        }
      } else if (ch == 4) {
        System.out.println("Enter index of product to update :");
        int indexU = input.nextInt();
        System.out.print("number: ");
        int new_num = input.nextInt();
        input.nextLine();
        System.out.print("name: ");
        String new_name = input.nextLine();
        System.out.print("price: ");
        double new_price = input.nextDouble();
        System.out.print("amount: ");
        int new_amount = input.nextInt();
        try {
          pro.set(indexU, new Product(new_num, new_name, new_price, new_amount));
        } catch (Exception e) {
          System.out.println("Cannot find product.");
        }

      } else if (ch == 5) {
        System.out.println("Bye.");
        break;
      }

    }
    input.close();
  }
}
