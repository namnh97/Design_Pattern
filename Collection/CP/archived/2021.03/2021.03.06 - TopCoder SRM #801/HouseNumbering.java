package Code;

public class HouseNumbering {
    public int[] prepareDigits(int firstHouse, int numberOfHouses) {
        int[] numbers = new int[10];
        for (int i = 0; i < numberOfHouses; i++) {
            if (i != 0) {
                firstHouse += 2;
            }
            int temp = firstHouse;
            while (temp != 0) {
                int number = temp % 10;
                temp = temp / 10;
                numbers[number]++;
            }
        }
        return numbers;
    }
}
