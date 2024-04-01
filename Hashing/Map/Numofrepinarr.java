package Hashing.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Numofrepinarr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr[] = {1, 4, 3, 2, 5, 72, 1, 3, 2, 4};
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        System.out.println("Enter The Number");
        int number = s.nextInt();
        System.out.println("Number " + number + " Repeated " + map.getOrDefault(number, 0) + " times");
        s.close();
    }
}
