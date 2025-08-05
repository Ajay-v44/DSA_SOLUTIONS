package Array;

public class FruitIntoBasket {
    public static void main(String[] args) {
        int[] fruits = {4, 2, 5};
        int[] baskets = {3, 5, 4};
        System.out.println(findRemainingFruits(fruits, baskets));
    }

    static int findRemainingFruits(int[] fruits, int[] baskets) {
        final int lengthOfFruits = fruits.length;
        int obtained = 0;
        for (int fruit : fruits) {
            for (int j = 0; j < lengthOfFruits; j++) {
                if (fruit <= baskets[j]) {
                    obtained += 1;
                    baskets[j] = -1;
                    break;
                }
            }
        }
        return lengthOfFruits - obtained;
    }
}
