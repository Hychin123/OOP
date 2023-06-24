package TP1;

public class Test1 {
  public static void main(String[] args) {
    System.out.println("Hello ex2:");
    System.out.printf("%-12s %30s. \n", "\\n", "Link break");
    System.out.printf("%-12s %30s. \n", "\\t", "Tabulation");
    System.out.printf("%-12s %30s. \n", "\\\'", "Single quote");
    System.out.printf("%-12s %30s. \n", "\\\"", "Double quote");
    System.out.printf("%-12s %30s. \n", "\\\\\\\\", "\\ Sign");
    System.out.printf("%-12s %30s. \n", "//", "Line comment");
    System.out.printf("%-12s %30s. \n", "/* ... */ ", "Block comment");
    System.out.printf("%-12s %30s. \n", "\"\"\"", "");
    System.out.printf("%-12s %30s. \n", "", "Text block");
    System.out.printf("%-12s %30s. \n", "\"\"\"", "");
  }
}
