package Code;

import FastIO.InputReader;
import java.io.PrintWriter;

public class TaskC {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int m = in.nextInt();
        int n = in.nextInt();
        String s = in.nextLine();
        String t = in.nextLine();
        int[] left = new int[n];
        int[] right = new int[n];
        for (int i = 0, j = 0; i < m && j < n; i++) {
            if (s.charAt(i) == t.charAt(j)) {
                left[j] = i;
                j++;
            }
        }

        for (int i = m - 1, j = n - 1; i >= 0 && j >= 0; i--) {
            if (s.charAt(i) == t.charAt(j)) {
                right[j] = i;
                j--;
            }
        }
        int res = 0;
        for (int i = 0; i < n - 1; i++) {
            res = Math.max(res, right[i + 1] - left[i]);
        }
        out.println(res);
    }
}
