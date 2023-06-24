package TP7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class SMS {
  private String content;

  public SMS(String content) {
    this.content = content;
  }

  public String getContent() {
    return content;
  }

  public List<SMS> getSMSlist() {
    return null;
  }

  public void decryptSMS(int index) {
  }

  public void viewReadableSMSes() {
  }

  public void removeSMS(int index) {
  }
}

class SMS_Decry {
  private List<SMS> smslist;
  private String password;

  public SMS_Decry(String password) {
    smslist = new ArrayList<>();
    this.password = password;
  }

  public void addSMS(String content) {
    smslist.add(new SMS(content));
  }

  public List<SMS> getSMSlist() {
    return smslist;
  }

  public void decryptSMS(int index) {
    if (index >= 0 && index < smslist.size()) {
      SMS sms = smslist.get(index);
      String decryptedContent = decrypt(sms.getContent(), password);
      System.out.println("Decrypted SMS:");
      System.out.println(decryptedContent);
    } else {
      System.out.println("Invalid SMS index.");
    }
  }

  public void viewReadableSMSes() {
    System.out.println("Readable SMSes:");
    for (int i = 0; i < smslist.size(); i++) {
      SMS sms = smslist.get(i);
      String decryptedContent = decrypt(sms.getContent(), password);
      if (decryptedContent != null) {
        System.out.println("Index: " + i);
        System.out.println("Content: " + decryptedContent);
        System.out.println();
      }
    }
  }

  public void removeSMS(int index) {
    if (index >= 0 && index < smslist.size()) {
      smslist.remove(index);
      System.out.println("SMS removed successfully.");
    } else {
      System.out.println("Invalid SMS index.");
    }
  }

  private String decrypt(String content, String password) {
    // Perform decryption logic using the provided password
    // Replace this with your actual decryption implementation
    return content;
  }

  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the decryption password: ");
    String password = scanner.nextLine();

    SMS smsApp = new SMS(password);

    while (true) {
      System.out.println("Menu:");
      System.out.println("1. List all SMSes");
      System.out.println("2. View SMS Detail (decrypt content using password)");
      System.out.println("3. View readable SMSes (all SMS that can be decrypted using the given password)");
      System.out.println("4. Remove SMSes by index");
      System.out.println("5. Quit");
      System.out.print("Enter your choice: ");
      int choice = scanner.nextInt();

      switch (choice) {
        case 1:
          listSMSes(smsApp);
          break;
        case 2:
          viewSMSDetail(smsApp);
          break;
        case 3:
          viewReadableSMSes(smsApp);
          break;
        case 4:
          removeSMS(smsApp);
          break;
        case 5:
          System.out.println("Exiting...");
          return;
        default:
          System.out.println("Invalid choice. Please try again.");
      }
    }
  }

  private static void listSMSes(SMS smsApp) {
    List<SMS> smsList = smsApp.getSMSlist();
    System.out.println("All SMSes:");
    for (int i = 0; i < smsList.size(); i++) {
      System.out.println("Index: " + i);
      System.out.println("Content: " + smsList.get(i).getContent());
      System.out.println();
    }
  }

  private static void viewSMSDetail(SMS smsApp) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the index of the SMS: ");
    int index = scanner.nextInt();
    smsApp.decryptSMS(index);
  }

  private static void viewReadableSMSes(SMS smsApp) {
    smsApp.viewReadableSMSes();
  }

  private static void removeSMS(SMS smsApp) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the index of the SMS to remove: ");
    int index = scanner.nextInt();
    smsApp.removeSMS(index);
  }
}
