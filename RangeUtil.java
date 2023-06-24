package TP5;

public class RangeUtil {
    int start;
    int end;
    int step;

    RangeUtil(int start, int end, int step) {
        this.start = start;
        this.end = end;
        this.step = step;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i += step) {
            sb.append(i);
            if (i != end && i + step <= end) {
                sb.append(", ");
            }
        }
        return sb.toString();

    }
}
