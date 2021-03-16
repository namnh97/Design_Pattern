package Code;

import FastIO.InputReader;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }
            int ans = 0;
            for (int i = 0; i < n - 1; i++) {
                int min = Math.min(a[i], a[i + 1]);
                int max = Math.max(a[i], a[i + 1]);
                while (min * 2 < max) {
                    min *= 2;
                    ans++;
                }
            }
            out.println(ans);
        }
    }
}
