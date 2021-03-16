package Code;

import FastIO.InputReader;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int k = in.nextInt();
            String s = in.nextLine();
            if (k == 0) {
                out.println("YES");
                continue;
            }
            int ok = 1;
            for (int i = 0; i < k; i++) {
                if (s.charAt(i) == s.charAt(n - i - 1)) {
                    ok = ok & 1;
                } else {
                    ok = ok & 0;
                }
            }
            if (ok == 1 && k * 2 < n) {
                out.println("YES");
            } else {
                out.println("NO");
            }
        }
    }
}
