package Code;

public class CreateMixture {
    public int[] mix(int concentration) {
        if (concentration == 0 || concentration == 1000) {
            return new int[0];
        }
        int d3 = concentration % 10; concentration /= 10;
        int d2 = concentration % 10; concentration /= 10;
        int d1 = concentration % 10; concentration /= 10;
        int[] result = new int[30];

        for (int i = 0; i < d3; i++) {
            result[i] = 1;
        }
        for (int i = 0; i < d2; i++) {
            result[i + 10] = 1;
        }
        for (int i = 0; i < d1; i++) {
            result[i + 20] = 1;
        }
        result[19] = 2;
        result[29] = 3;
        return result;
    }
}
