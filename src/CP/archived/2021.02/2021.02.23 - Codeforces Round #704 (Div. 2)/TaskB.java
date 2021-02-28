package Code;

import FastIO.InputReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TaskB {
    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            ArrayList<Integer> inputArr = new ArrayList<>(n + 5);
            ArrayList<Integer> arrayWithMax = new ArrayList<>(n + 5);
            int[] arraySaveMax = new int[n + 5];
            Arrays.fill(arraySaveMax, 0);

            for (int i = 0; i < n; i++) {
                int tmp = in.nextInt();
                inputArr.add(tmp);
            }

            int max = n;
            for (int i = inputArr.size() - 1; i >= 0; i--) {
                arrayWithMax.add(inputArr.get(i));
                if (inputArr.get(i) == max) {
                    for (int j = arrayWithMax.size() - 1; j >= 0; j--) {
                        out.print(arrayWithMax.get(j) + " ");
                        arraySaveMax[arrayWithMax.get(j)] = 1;
                    }
                    arrayWithMax.clear();
                    while (arraySaveMax[max] == 1 && max > 0) {
                        max--;
                    }
                }
            }
            out.println();
        }
    }
}
