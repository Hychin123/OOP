package TP6;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
  private String name;
  private String id;
  private String major;
  private int year;

  public Student(String name, String id, String major, int year) {
    this.name = name;
    this.id = id;
    this.major = major;
    this.year = year;
  }

  public String GetId() {
    return id;
  }

  public String GetName() {
    return name;
  }

  public String GetMajor() {
    return major;
  }

  public int GetYear() {
    return year;
  }

  public void setId(String id) {
    this.id = id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setMajor(String major) {
    this.major = major;
  }

  public void setYear(int year) {
    this.year = year;
  }

}

public class ex2 {
  public static void main(String[] args) {
    ArrayList<Student> students = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    while (true) {

      System.out.println("1. Add new student.");
      System.out.println("2. List student.");
      System.out.println("3. Remove student by name.");
      System.out.println("4. Update student information by id.");
      System.out.println("5. Quit");
      System.out.println("Select an Option :");

      int ch = input.nextInt();
      input.nextLine();

      if (ch == 1) {
        System.out.println("Enter student name:");
        String name = input.nextLine();
        System.out.println("Enter student id:");
        String id = input.nextLine();
        System.out.println("Enter student major:");
        String major = input.nextLine();
        System.out.println("Enter student year:");
        int year = input.nextInt();

        Student student = new Student(name, id, major, year);
        students.add(student);
      } else if (ch == 2) {
        for (Student student : students) {
          System.out.println(
              student.GetId() + ": " + student.GetName() + " : " + student.GetMajor() + ": " + student.GetYear());
        }
      } else if (ch == 3) {
        System.out.println("Enter student name:");
        String name = input.nextLine();

        boolean remove = false;
        for (int i = 0; i < students.size(); i++) {
          if (students.get(i).GetName().equals(name)) {
            students.remove(i);
            remove = true;
            break;
          }
        }
        if (remove) {
          System.out.println("Student removed successful.");
        } else {
          System.out.println("Student not found.");
        }
      } else if (ch == 4) {
        System.out.print("Enter student ID: ");
        String studentID = input.nextLine();

        boolean found = false;
        for (Student student : students) {
          if (student.GetId().equals(studentID)) {
            System.out.print("Enter new student name: ");
            String name = input.nextLine();

            System.out.print("Enter new student major: ");
            String major = input.nextLine();

            System.out.print("Enter new student year: ");
            int year = input.nextInt();
            input.nextLine(); // consume the newline character

            student.setName(name);
            student.setMajor(major);
            student.setYear(year);

            found = true;
            System.out.println("Student information updated successfully.");
            break;
          }
        }

        if (!found) {
          System.out.println("Student not found.");
        }
      } else if (ch == 5) {
        System.out.println("Goodbye");
      }
      System.out.println();
    }
  }
}
