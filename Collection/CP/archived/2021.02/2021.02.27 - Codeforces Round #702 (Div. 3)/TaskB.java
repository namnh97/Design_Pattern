package Code;

import FastIO.InputReader;
import java.io.PrintWriter;
import java.util.Comparator;
import java.util.TreeSet;

public class TaskB {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int[] remainders = new int[3];
            for (int i = 0; i < n; i++) {
                int remainder = in.nextInt() % 3;
                remainders[remainder]++;
            }
            int res = 0;
            int base = n / 3;
            while (getMin(remainders) != base) {
                for (int i = 0; i < 3; i++) {
                    while (remainders[i] > base) {
                        remainders[i]--;
                        remainders[(i + 1) % 3]++;
                        res++;
                    }
                }
            }
            out.println(res);
        }
    }

    private int getMin(int[] remainders) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < remainders.length; i++) {
            if (min > remainders[i]) {
                min = remainders[i];
            }
        }
        return min;
    }
}
