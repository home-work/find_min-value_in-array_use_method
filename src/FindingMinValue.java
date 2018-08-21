import java.util.Random;
import java.util.Scanner;

public class FindingMinValue {
    public static void main(String[] args) {
        int[] array = generateArray(getSizeOfArray());
        displayArray(array);
        findMinValue(array);
    }

    private static int getSizeOfArray() {
        System.out.println("Nhập vào kích thước của mảng:");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void displayArray(int[] array) {
        System.out.println("Mảng:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }

    private static int[] generateArray(int sizeOfArray) {
        int[] array = new int[sizeOfArray];
        Random random = new Random();
        for (int i = 0; i < sizeOfArray; i++) {
            array[i] = random.nextInt(100) + 1;
        }
        return array;
    }


    private static void findMinValue(int[] array) {
        int minValue = array[0];
        for (int i = 0; i < array.length; i++) {
            if (minValue > array[i]) {
                minValue = array[i];
            }
        }
        System.out.println("\nGiá trị nhỏ nhất trong mảng là: " + minValue);
    }
}
