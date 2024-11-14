
import java.util.Scanner;

public class ArrSortedOrNot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int arr[] = new int[size];
        boolean isSorted = true; 

        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }

        for (int i = 1; i < size; i++) {
            if (arr[i] < arr[i - 1]) {
                isSorted = false;
            }
        }

        if (isSorted) {
            System.out.println("Array is sorted in ascending order");
        } else {
            System.out.println("Array is not sorted");
        }

        s.close();
    }
}
