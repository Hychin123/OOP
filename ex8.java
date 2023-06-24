package TP5;

public class ex8 {
  private int start;
  private int end;
  private int step;

  public ex8(int start, int end, int step) {
    this.start = start;
    this.end = end;
    this.step = step;
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    for (int i = start; i <= end; i += step) {
      sb.append(i);
      if (i < end - step + 1) {
        sb.append(", ");
      }
    }
    return sb.toString();
  }

  public static void main(String[] args) {
    TP5.ex3.main(null);
    TP5.ex2.main(null);
  }
}
