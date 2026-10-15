import java.util.*;

// Task1: Find positions (1-based) of the integer(s) from input
// that are closest to the average but not less than the average.
public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            if (!sc.hasNextInt()) return;
            arr[i] = sc.nextInt();
        }

        double sum = 0.0;
        for (int v : arr) sum += v;
        double avg = sum / n;

        double minDiff = Double.POSITIVE_INFINITY;
        for (int v : arr) {
            if (v >= avg) {
                double diff = v - avg;
                if (diff < minDiff) minDiff = diff;
            }
        }

        StringBuilder sb = new StringBuilder();
        final double EPS = 1e-9;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= avg) {
                double diff = arr[i] - avg;
                if (Math.abs(diff - minDiff) <= EPS) {
                    if (sb.length() > 0) sb.append(" ");
                    sb.append(i + 1);
                }
            }
        }

        System.out.println(sb.toString());
    }
}
