package TP7;

import java.util.ArrayDeque;
import java.util.Scanner;

class SMS {
  private String subject;
  private String fromphonenumber;
  private String receivernumber;
  private String type;
  private String content;
  private String status;

  public SMS(String subject, String fromphonenumber, String receivernumber, String type, String content,
      String status) {
    this.subject = subject;
    this.content = content;
    this.type = type;
    this.fromphonenumber = fromphonenumber;
    this.receivernumber = receivernumber;
    this.status = status;
  }

  public SMS(String fromphoneNumber, String receivernumber, String content) {
    this("", fromphoneNumber, receivernumber, "Text", content, "new");
  }

  public SMS(String fromphoneNumber, String receivernumber, String content, String status) {
    this("", fromphoneNumber, receivernumber, "Text", content, status);
  }

  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public String getfromphonenumber() {
    return fromphonenumber;
  }

  public void setfromphonenumber(String fromphonenumber) {
    this.fromphonenumber = fromphonenumber;
  }

  public String getreceivernumber() {
    return receivernumber;
  }

  public void setreceivernumber(String receivernumber) {
    this.receivernumber = receivernumber;
  }

  public String gettype() {
    return type;
  }

  public void settype(String type) {
    this.type = type;
  }

  public String getcontent() {
    return content;
  }

  public void setcontent(String content) {
    this.content = content;
  }

  public String getstatus() {
    return status;
  }

  public void setstatus(String status) {
    this.status = status;
  }
}

class SMSList {
  private ArrayDeque<SMS> smslist;
  // To define the maximum number of characters per sms
  private static final int MAX_CHARACTERS_PER_SMS = 160;

  public SMSList() {
    smslist = new ArrayDeque<>();
  }

  public void addSMS(SMS sms) {
    smslist.add(sms);
  }

  public void add(String message) {
    int smsCount = (int) Math.ceil((double) message.length() / MAX_CHARACTERS_PER_SMS);
    for (int i = 0; i < smsCount; i++) {
      int startIndex = i * MAX_CHARACTERS_PER_SMS;
      int endIndex = Math.min(startIndex + MAX_CHARACTERS_PER_SMS, message.length());
      String content = message.substring(startIndex, endIndex);
      SMS sms = new SMS("", "", content);
      smslist.add(sms);
    }
  }

  public void add(String message, String title) {
    SMS sms = new SMS(title, "", message);
    smslist.add(sms);
  }
}

public class SMS_Encrypt {

  private static SMSList smsList = new SMSList();
  private static Scanner ch = new Scanner(System.in);

  public static void main(String[] args) {
    boolean quit = false;
    while (!quit) {
      displayMenu();
      int choise = UserChoice();
      switch (choise) {
        case 1:
          SendSMS();
          break;
        case 2:
          ViewSMS();
          break;
        case 3:
          listSMS();
          break;
        case 4:
          RemoveSMS();
          break;
        case 5:
          quit = true;
          System.out.println("program terminated.");
          break;
        default:
          System.out.println("Invalid choice, Please try again.");
          break;
      }
    }
  }

  private static void displayMenu() {
    System.out.println("Menu:");
    System.out.println("1. Send new SMS with Encryted content using password method.");
    System.out.println("2. View SMS detail.");
    System.out.println("3. List SMS");
    System.out.println("4. Remove SMS by index.");
    System.out.println("5. Exit");
  }

  private static int UserChoice() {
    System.out.println("Enter your choice:");
    return Integer.parseInt(ch.nextLine());
  }

  private static void SendSMS() {
    System.out.println("Enter the content of the SMS:");
    ch.nextLine();

    String content = ch.nextLine();
    System.out.println("Enter the password for ecryption:");
    String password = ch.nextLine();

    smsList.add(content);
    System.out.println("SMS sent successfully.");
  }

  private static void ViewSMS() {
    System.out.println("Entr the index of the SMS:");
    int index = ch.nextInt();
  }

  private static void listSMS() {

  }

  private static void RemoveSMS() {
    System.out.println("Enter the index of the SMS to remove:");
    int index = ch.nextInt();

    System.out.println("SMS removed successfully.");
  }
}
