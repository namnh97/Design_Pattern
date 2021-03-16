package Code;

import FastIO.InputReader;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Stack;

public class TaskA {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int t = in.nextInt();
        while (t-- > 0) {
            String a = in.nextLine();

            // check first == end
            int x = a.charAt(0) - 'A';
            int y = a.charAt(a.length() - 1) - 'A';
            if (x == y) {
                out.println("NO");
                continue;
            }

            //find the exclusive number.
            int[] d = new int[3];
            d[x] = 1; d[y] = -1;
            if (count(a, (char) (x + 'A')) == a.length() / 2) {
                d[3 ^ x ^ y] = -1;
            } else {
                d[3 ^ x ^ y] = 1;
            }

            int check = 0;
            for (int i = 0; i < a.length(); i++) {
                check += d[a.charAt(i) - 'A'];
                if (check < 0) {
                    break;
                }
            }
            if (check == 0) {
                out.println("YES");
            } else {
                out.println("NO");
            }
        }
    }

    private int count(String a, char c) {
        int res = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == c) {
                res++;
            }
        }
        return res;
    }
}
