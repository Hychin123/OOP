package TP6;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.UIDefaults.ProxyLazyValue;

class Course {
  private String name;

  Course(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public String toString() {
    return name;
  }
}

public class ex4 {
  public static void main(String[] args) {
    ArrayList<Course> cour = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    cour.add(new Course("Database"));
    cour.add(new Course("Mathlab"));
    cour.add(new Course("Program Java"));

    while (true) {

      System.out.print("""
            ========== Menu ==========
            1. List all courses
            2. Find courses by name
            3. Add new course
            4. Quit
            Select an Option:
          """);
      int ch = input.nextInt();
      input.nextLine();
      if (ch == 1) {
        for (Course course : cour) {
          System.out.println(course);
        }
      } else if (ch == 2) {
        System.out.println("Find course by name:");
        String name = input.nextLine();
        var found = false;
        for (Course course : cour) {
          if (course.getName().equalsIgnoreCase(name)) {
            System.out.println(course);
            found = true;
          }
        }
        if (!found) {
          System.out.println("Not found Course.");
        }

      } else if (ch == 3) {
        System.out.println("Enter your course name:");
        String name = input.next();
        cour.add(new Course(name));
        System.out.println("course added.");
      } else if (ch == 4) {
        System.out.println("Bye.");
        break;
      }
    }
    input.close();
  }
}
