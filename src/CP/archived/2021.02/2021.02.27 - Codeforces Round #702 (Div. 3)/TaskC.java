package Code;

import FastIO.InputReader;
import java.io.PrintWriter;
import java.util.TreeSet;

public class TaskC {
    private static TreeSet<Long> cubes = null;
    private static long N;
    public void preCal() {
        cubes = new TreeSet<>();
        for (long i = 1; i * i * i < N; i++) {
            cubes.add(i * i * i);
        }
    }
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int t = in.nextInt();
        while (t-- > 0) {
            N = in.nextLong();
            preCal();
            boolean res = false;
            for (long i = 1; i * i * i < N; i++) {
                Long tmp = N - i * i * i;
                if (cubes.contains(tmp)) {
                    res = true;
                }
            }
            if (res == true) {
                out.println("YES");
            } else {
                out.println("NO");
            }
        }
    }
}
