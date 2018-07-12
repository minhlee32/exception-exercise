import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer[] arr = arrayExample.createRandom();

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nPlease enter index: ");
        int x = scanner.nextInt();
        try {
            System.out.println("Element at index " + x + " is " + arr[x]);
        } catch (Exception e) {
            System.out.println("Index is over bound of array");
        }
    }

    private Integer[] createRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.print("List of elements in array: ");
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.print(arr[i] + "\t");
        }
        return arr;
    }
}
