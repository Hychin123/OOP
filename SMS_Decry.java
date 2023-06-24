
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import TP7.SMS;

class SMS {
  private String content;

  public SMS(String content) {
    this.content = content;
  }

  public String getContent() {
    return content;
  }
}

class SMSApp {
  private List<SMS> smsList;
  private String password;

  public SMSApp(String password) {
    smsList = new ArrayList<>();
    this.password = password;
  }

  public void addSMS(String content) {
    smsList.add(new SMS(content));
  }

  public List<SMS> getSMSList() {
    return smsList;
  }

  public void decryptSMS(int index) {
    if (index >= 0 && index < smsList.size()) {
      SMS sms = smsList.get(index);
      String decryptedContent = decrypt(sms.getContent(), password);
      System.out.println("Decrypted SMS:");
      System.out.println(decryptedContent);
    } else {
      System.out.println("Invalid SMS index.");
    }
  }

  public void viewReadableSMSes() {
    System.out.println("Readable SMSes:");
    for (int i = 0; i < smsList.size(); i++) {
      SMS sms = smsList.get(i);
      String decryptedContent = decrypt(sms.getContent(), password);
      if (decryptedContent != null) {
        System.out.println("Index: " + i);
        System.out.println("Content: " + decryptedContent);
        System.out.println();
      }
    }
  }

  public void removeSMS(int index) {
    if (index >= 0 && index < smsList.size()) {
      smsList.remove(index);
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

public class SMS_Decry {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the decryption password: ");
    String password = scanner.nextLine();

    SMSApp smsApp = new SMSApp(password);

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

  private static void listSMSes(SMSApp smsApp) {
    List<SMS> smsList = smsApp.getSMSList();
    System.out.println("All SMSes:");
    for (int i = 0; i < smsList.size(); i++) {
      System.out.println("Index: " + i);
      System.out.println("Content: " + smsList.get(i).getContent());
      System.out.println();
    }
  }

  private static void viewSMSDetail(SMSApp smsApp) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the index of the SMS: ");
    int index = scanner.nextInt();
    smsApp.decryptSMS(index);
  }

  private static void viewReadableSMSes(SMSApp smsApp) {
    smsApp.viewReadableSMSes();
  }

  private static void removeSMS(SMSApp smsApp) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the index of the SMS to remove: ");
    int index = scanner.nextInt();
    smsApp.removeSMS(index);
  }
}
