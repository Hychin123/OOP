package TP7;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
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

  public String getContent() {
    return content;
  }
}

public class smsapp {
  private Map<String, String> credentials;
  private String loggedInUser;
  private List<SMS> smsList;

  public smsapp() {
    credentials = new HashMap<>();
    loggedInUser = null;
    smsList = new ArrayList<>();
  }

  public void addUser(String username, String password) {
    credentials.put(username, password);
  }

  public void login(String username, String password) {
    if (credentials.containsKey(username) && credentials.get(username).equals(password)) {
      loggedInUser = username;
      System.out.println("Logged in successfully!");
    } else {
      System.out.println("Invalid username or password.");
    }
  }

  public void logout() {
    loggedInUser = null;
    System.out.println("Logged out successfully!");
  }

  public void viewAllSMS() {
    if (loggedInUser == null) {
      System.out.println("Please login first.");
      return;
    }

    if (smsList.isEmpty()) {
      System.out.println("No SMS messages available.");
      return;
    }

    System.out.println("---- SMS List ----");
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
    if (loggedInUser == null) {
      System.out.println("Please login first.");
      return;
    }

    if (index < 1 || index > smsList.size()) {
      System.out.println("Invalid index.");
      return;
    }

    SMS sms = smsList.get(index - 1);
    System.out.println("---- SMS Detail ----");
    System.out.println("Sender: " + sms.getSender());
    System.out.println("Recipient: " + sms.getRecipient());
    System.out.println("Title: " + sms.getTitle());
    System.out.println("Content: " + sms.getContent());
    System.out.println("--------------------");
  }

  public void sendSMS(String recipient, String title, String content) {
    if (loggedInUser == null) {
      System.out.println("Please login first.");
      return;
    }

    SMS sms = new SMS(loggedInUser, recipient, title, content);
    smsList.add(sms);
    System.out.println(":) Your message has been sent to " + recipient + ".");
  }

  public void removeSMS(int index) {
    if (loggedInUser == null) {
      System.out.println("Please login first.");
      return;
    }

    if (index < 1 || index > smsList.size()) {
      System.out.println("Invalid index.");
      return;
    }

    smsList.remove(index - 1);
    System.out.println("SMS removed successfully.");
  }

  public static void main(String[] args) {
    smsapp smsTool = new smsapp();
    smsTool.addUser("sasa", "123");
    smsTool.addUser("vanny", "123456");
    smsTool.addUser("bopha", "7733");

    Scanner scanner = new Scanner(System.in);

    while (true) {
      if (smsTool.loggedInUser == null) {
        System.out.print("Please enter username: ");
        String username = scanner.nextLine();
        System.out.print("Please enter password: ");
        String password = scanner.nextLine();
        smsTool.login(username, password);
        if (smsTool.loggedInUser == null) {
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
      int choice = scanner.nextInt();
      scanner.nextLine(); // Consume newline character

      switch (choice) {
        case 1:
          smsTool.viewAllSMS();
          break;
        case 2:
          System.out.print("Enter the index of the SMS: ");
          int smsIndex = scanner.nextInt();
          scanner.nextLine(); // Consume newline character
          smsTool.viewSMSDetail(smsIndex);
          break;
        case 3:
          System.out.print("To username: ");
          String recipient = scanner.nextLine();
          System.out.print("Title: ");
          String title = scanner.nextLine();
          System.out.println("Content (Enter END to end the content):");
          StringBuilder contentBuilder = new StringBuilder();
          String line;
          while (!(line = scanner.nextLine()).equalsIgnoreCase("END")) {
            contentBuilder.append(line).append("\n");
          }
          String content = contentBuilder.toString().trim();
          smsTool.sendSMS(recipient, title, content);
          break;
        case 4:
          System.out.print("Enter the index of the SMS to remove: ");
          int removeIndex = scanner.nextInt();
          scanner.nextLine(); // Consume newline character
          smsTool.removeSMS(removeIndex);
          break;
        case 5:
          smsTool.logout();
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
