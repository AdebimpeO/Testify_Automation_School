package Challenge;
import java.util.Arrays;

    public class CountingSort {
        public static void main(String... args) {
            int[] inputArray = generateRandomArray(1000000, 1, 9);
            System.out.println("Unsorted Array: " + Arrays.toString(inputArray));

            int[] sortedArray = countingSort(inputArray, 1, 9);
            System.out.println("Sorted Array: " + Arrays.toString(sortedArray));
        }

        public static int[] countingSort(int[] array, int min, int max) {
            int[] countArray = new int[max - min + 1];

            for (int num : array) {
                countArray[num - min]++;
            }

            int z = 0;
            for (int i = min; i <= max; i++) {
                while (countArray[i - min] > 0) {
                    array[z] = i;
                    z++;
                    countArray[i - min]--;
                }
            }

            return array;
        }

        public static int[] generateRandomArray(int size, int min, int max) {
            int[] array = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = (int) (Math.random() * (max - min + 1)) + min;
            }
            return array;
        }
    }
