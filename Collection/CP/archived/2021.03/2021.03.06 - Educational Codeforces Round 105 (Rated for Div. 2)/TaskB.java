package Code;

import FastIO.InputReader;
import java.io.PrintWriter;

public class TaskB {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            int u = in.nextInt();
            int r = in.nextInt();
            int d = in.nextInt();
            int l = in.nextInt();
            boolean check = false;

            for (int i = 0; i < 16; i++) {
                int tu = u, tr = r, td = d, tl = l;

                if ((i & 1) == 1) {
                    tu -= 1;
                    tr -= 1;
                }
                if ((i & 2) == 2) {
                    tr -= 1;
                    td -= 1;
                }
                if ((i & 4) == 4) {
                    td -= 1;
                    tl -= 1;
                }
                if ((i & 8) == 8) {
                    tl -= 1;
                    tu -= 1;
                }

                if (getMin(tu, tr, td, tl) >= 0 && getMax(tu, tr, td, tl) <= n - 2) {
                    check = true;
                    break;
                }
            }
            if (check == true) {
                out.println("YES");
            } else {
                out.println("NO");
            }
        }
    }

    private int getMax(int tu, int tr, int td, int tl) {
        return Math.max(tu, Math.max(tr, Math.max(td, tl)));
    }

    private int getMin(int tu, int tr, int td, int tl) {
        return Math.min(tu, Math.min(tr, Math.min(td, tl)));
    }
}
