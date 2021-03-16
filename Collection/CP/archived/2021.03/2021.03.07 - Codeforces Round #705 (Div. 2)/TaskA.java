package Code;

import FastIO.InputReader;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int k = in.nextInt();
            int[] chosen = new int[n + 1];
            int len = Math.min(n, k);
            for (int i = len; i >= 0; i--) {
                if (chosen[i] == 0) {
                    chosen[k - i] = 1;
                }
            }
            boolean check = false;
            for (int i = 1; i <= n; i++) {
                if (chosen[i] == 0) {
                    check = true;
                    out.print(i + " ");
                }
            }
            if (check == false) {
                out.print(0);
            }
            out.println();
        }
    }
}
