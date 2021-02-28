package Code;

import FastIO.InputReader;
import java.io.PrintWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int t = in.nextInt();
        while (t-- > 0) {
            long p = in.nextLong();
            long a = in.nextLong();
            long b = in.nextLong();
            long c = in.nextLong();
            long res = Math.min((a - p % a) % a, Math.min((b - p % b) % b, (c - p % c) % c));
            out.println(res);
        }
    }
}
