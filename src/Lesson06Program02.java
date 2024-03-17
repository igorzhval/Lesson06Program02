import java.util.Arrays;
import java.util.Random;
public class Lesson06Program02 {
    public static void main(String[] args) {
        int[] firstArray = generateRandomArray(7);
        int[] secondArray = generateRandomArray(7);
        Arrays.sort(firstArray);
        Arrays.sort(secondArray);
        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));
        int countMatches = countMatches(firstArray, secondArray);
        System.out.println("Кількість збігів: " + countMatches);
    }
    public static int[] generateRandomArray(int size) {
        int[] array = new int[size];
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(10);
        }
        return array;
    }
    public static int countMatches(int[] firstArray, int[] secondArray) {
        int count = 0;
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] == secondArray[i]) {
                count++;
            }
        }
        return count;
    }
}