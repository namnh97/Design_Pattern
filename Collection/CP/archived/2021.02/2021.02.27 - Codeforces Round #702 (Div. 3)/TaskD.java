package Code;

import FastIO.InputReader;
import java.io.PrintWriter;
import java.util.Arrays;

public class TaskD {
    public class Node {
        int val;
        int index;
        public Node() {

        }
        public Node(int val, int index) {
            this.val = val;
            this.index = index;
        }
    }

    private static int N;
    private static Node[] a;
    private static Integer[] depths;

    public void solve(int testNumber, InputReader in, PrintWriter out) {
        int t = in.nextInt();
        while (t-- > 0) {
            N = in.nextInt();
            a = new Node[N];
            depths = new Integer[N];
            for (int i = 0; i < N; i++) {
                a[i] = new Node();
                a[i].val = in.nextInt();
                a[i].index = i;
            }

            process(a, 0);
            for (int i = 0; i < N; i++) {
                out.print(depths[i] + " ");
            }
            out.println();
        }
    }

    private void process(Node[] a, int count) {
        if (a.length == 0) return;
        int index = getMaxIndex(a);
        depths[a[index].index] = count;
        count++;
        if (a.length == 1) return;
        Node[] leftArray = Arrays.copyOfRange(a, 0, index);
        Node[] rightArray = Arrays.copyOfRange(a, index + 1, a.length);
        process(leftArray, count);
        process(rightArray, count);

    }

    private int getMaxIndex(Node[] a) {
        int max = Integer.MIN_VALUE;
        int index = -1;
        for (int i = 0; i < a.length; i++) {
            if (max < a[i].val) {
                max = a[i].val;
                index = i;
            }
        }
        return index;
    }
}
