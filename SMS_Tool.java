package TP7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class SMS {
  private String sender;
  private String recipient;
  private String title;
  private String content;

  public SMS(String sender, String recipient, String title, String content) {
    this.sender = sender;
    this.recipient = recipient;
    this.title = title;
    this.content = content;
  }

  public String getSender() {
    return sender;
  }

  public String getRecipient() {
    return recipient;
  }

  public String getTitle() {
    return title;
  }

  public String getCotent() {
    return content;
  }
}

public class SMS_Tool {
  private Map<String, String> credentials;
  private String loggedInuser;
  private List<SMS> smsList;

  public SMS_Tool() {
    credentials = new HashMap<>();
    loggedInuser = null;
    smsList = new ArrayList<>();
  }

  public void addUser(String username, String password) {
    credentials.put(username, password);
  }

  public void login(String username, String password) {
    if (credentials.containsKey(username) && credentials.get(username).equals(password)) {
      loggedInuser = username;
      System.out.println("Logged in successfully!.");
    } else {
      System.out.println("Invalid username  or password.");
    }
  }

  public void logout() {
    loggedInuser = null;
    System.out.println("Logged out successfully!.");
  }

  public void viewAllsms() {
    if (loggedInuser == null) {
      System.out.println("Please login first.");
      return;
    }

    if (smsList.isEmpty()) {
      System.out.println("No SMS message available.");
      return;
    }

    System.out.println("----- SMS List -----");
    int index = 1;
    for (SMS sms : smsList) {
      System.out.println("Index: " + index);
      System.out.println("Sender: " + sms.getSender());
      System.out.println("Title: " + sms.getTitle());
      System.out.println("------------------");
      index++;
    }
  }

  public void viewSMSDetail(int index) {
    if (loggedInuser == null) {
      System.out.println("Please login first.");
      return;
    }
    if (index < 1 || index > smsList.size()) {
      System.out.println("Invalid index.");
      return;
    }

    SMS sms = smsList.get(index - 1);
    System.out.println("----- SMS Detail -----");
    System.out.println("Sender :" + sms.getSender());
    System.out.println("Recipient:" + sms.getRecipient());
    System.out.println("Title :" + sms.getTitle());
    System.out.println("Content :" + sms.getCotent());
    System.out.println("----------------------------");
  }

  public void sendSMS(String recipient, String title, String content) {
    if (loggedInuser == null) {
      System.out.println("Please login first.");
      return;
    }

    SMS sms = new SMS(loggedInuser, recipient, title, content);
    smsList.add(sms);
    System.out.println(":) Your message has been sent to " + recipient + ".");
  }

  public void removeSMS(int index) {
    if (loggedInuser == null) {
      System.out.println("Please login first.");
      return;
    }

    if (index < 1 || index > smsList.size()) {
      System.out.println("Invalid index.");
      return;
    }

    smsList.remove(index - 1);
    System.out.println("SMS removed successfullt.");
  }

  public static void main(String[] args) {
    SMS_Tool smsTool = new SMS_Tool();
    smsTool.addUser("sasa", "123");
    smsTool.addUser("vanny", "1234");
    smsTool.addUser("bopha", "12345");

    Scanner sc = new Scanner(System.in);

    while (true) {
      if (smsTool.loggedInuser == null) {
        System.out.println("Please enter username:");
        String username = sc.nextLine();
        System.out.println("Please ecter password:");
        String password = sc.nextLine();

        smsTool.login(username, password);
        if (smsTool.loggedInuser == null) {
          continue;
        }
      }

      System.out.println("---- Welcome to SMS App ----");
      System.out.println("1. List all SMS");
      System.out.println("2. View SMS detail");
      System.out.println("3. Send SMS");
      System.out.println("4. Remove SMS by index");
      System.out.println("5. Quit");
      System.out.print("Choose an option: ");
      int choice = sc.nextInt();
      switch (choice) {
        case 1:
          smsTool.viewAllsms();
          break;
        case 2:
          System.out.println("Enter the index of the SMS:");
          int smsIndex = sc.nextInt();
          smsTool.viewSMSDetail(smsIndex);
          break;
        case 3:
          System.out.println("To username:");
          String recipient = sc.next();
          sc.nextLine();// concume newline character
          System.out.println("Title :");
          String title = sc.nextLine();
          System.out.println("Content (Enter END to end the content):");
          StringBuilder contenBuilder = new StringBuilder();
          String line;
          while (!(line = sc.nextLine()).equalsIgnoreCase("END")) {
            contenBuilder.append(line).append("\n");
          }

          String content = contenBuilder.toString().trim();
          smsTool.sendSMS(recipient, title, content);
          break;
        case 4:
          System.out.println("Enter the index of the SMS to remove:");
          int removeIndex = sc.nextInt();
          smsTool.removeSMS(removeIndex);
          break;
        case 5:
          System.out.println("Exiting program...");
          System.exit(0);
          break;
        default:
          System.out.println("Invalid choice. Please try again.");
          break;
      }
      System.out.println();

    }
  }
}