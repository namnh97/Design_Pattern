package Code;


import java.util.*;

public class SecondDiameters {
    public static final int MAX = 2001;

    public long getSecondDiameters(int[] X, int[] Y) {
        int len = X.length;
        List<Double> dist = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                dist.add(getDist(X[i], Y[i], X[j], Y[j]));
            }
        }

        Collections.sort(dist, Comparator.reverseOrder());
        List<Pair> w = new ArrayList<>();
        for (Double it : dist) {
            if (w.isEmpty() || w.get(w.size() - 1).first.compareTo(it) != 0) {
                w.add(new Pair(it, 0));
            }
            Pair newPair = new Pair(it, w.get(w.size() - 1).second + 1);
            w.set(w.size() - 1, newPair);
        }

        long result = 0;
        TreeMap<Double, Integer> m2 = new TreeMap<>();
        for (int i = 0; i < len; i++) {
            m2.clear();
            for (int j = 0; j < len; j++) {
                double distance = getDist(X[i], Y[i], X[j], Y[j]);
                if (m2.containsKey(distance)) {
                    m2.put(distance, m2.get(distance) + 2);
                } else {
                    m2.put(distance, 0);
                }
            }
            double temp = -1;
            for (Pair pair : w) {
                if (m2.containsKey(pair.first) == true && pair.second > m2.get(pair.first)) {
                    if (temp == -1) temp = -2;
                    else {
                        temp = pair.first;
                        break;
                    }
                }
            }
            result += temp;
        }
        return  result;
    }

    private double getDist(int x, int i, int x1, int i1) {
        double first = Math.pow((x - x1), 2);
        double second = Math.pow((i - i1), 2);
        return Math.sqrt(first + second);
    }

    public class Pair {
        public Double first;
        public Integer second;

        public Pair(Double first, Integer second) {
            this.first = first;
            this.second = second;
        }
    }
}
