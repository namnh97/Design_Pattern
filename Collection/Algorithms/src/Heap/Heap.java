package Algorithms.Heap;

import java.util.ArrayList;

public class Heap {
    private static ArrayList<Integer> h;
    private static void swap(int i, int j) {
        int x = h.get(i);
        h.set(i, h.get(j));
        h.set(j, x);
    }

    private static void minHeapify(int i) {
        int smallest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < h.size() && h.get(left) < h.get(smallest)) {
            smallest = left;
        }
        if (right < h.size() && h.get(right) < h.get(smallest)) {
            smallest = right;
        }
        if (smallest != i) {
            swap(i, smallest);
            minHeapify(smallest);
        }
    }
    private static void build(int n) {
        // n / 2 - 1
        for (int i = n / 2 - 1; i >= 0; i--) {
            minHeapify(i);
        }
    }

    private static int top() {
        return h.get(0);
    }

    private static void push(int value) {
        h.add(value);
        int i = h.size() - 1;
        while (i != 0 && h.get((i - 1) / 2) > h.get(i)) {
            swap(i, (i - 1) / 2);
            i = (i - 1) / 2;
        }
    }

    private static void pop() {
        if (h.size() == 0) {
            return;
        }
        int n = h.size();
        h.set(0, h.get(n - 1));
        h.remove(n - 1);
        minHeapify(0);
    }
}
