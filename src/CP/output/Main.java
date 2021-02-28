import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;

/**
 * Built using CHelper plug-in
 * Actual solution is at the top
 */
public class Main {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        TaskD solver = new TaskD();
        solver.solve(1, in, out);
        out.close();
    }

    static class TaskD {
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

    }

    static class InputReader {
        BufferedReader br;
        StringTokenizer st;

        public InputReader(InputStream stream) {
            br = new BufferedReader(new InputStreamReader(stream));
        }

        public String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

    }
}

