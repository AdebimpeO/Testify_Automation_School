package Challenge;

public class MaxProductInArray {
        public static void main(String... args) {
            int[] array = {1, 3, 7, 9, 2, 5, 8, 4};
            int[] result = findMaxProductPair(array);
            System.out.println("The two numbers with maximum product are: " + result[0] + " and " + result[1]);
        }

        public static int[] findMaxProductPair(int[] array) {
            if (array.length < 2) {
                throw new IllegalArgumentException("Array should have at least two elements");
            }

            int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
            int min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;

            for (int num : array) {
                if (num > max1) {
                    max2 = max1;
                    max1 = num;
                } else if (num > max2) {
                    max2 = num;
                }

                if (num < min1) {
                    min2 = min1;
                    min1 = num;
                } else if (num < min2) {
                    min2 = num;
                }
            }

            if (max1 * max2 > min1 * min2) {
                return new int[]{max1, max2};
            } else {
                return new int[]{min1, min2};
            }
        }
    }