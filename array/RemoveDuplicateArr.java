package array;

public class RemoveDuplicateArr {
    public static void main(String[] args) {
        int arr[] = {1, 3, 2, 4, 5, 2};
        int n = arr.length;
        System.out.println(n);

        for (int i = 0; i < n - 1; i++) {
            for (int j = i; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Array has been sorted:");


        int result[] = new int[n];
        result[0] = arr[0];
        int j = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[i - 1]) {
                result[j] = arr[i];
                j++;
            }
        }

        System.out.println("Array with duplicates removed:");

        for (int i = 0; i < j; i++) {
            System.out.print(result[i] + " ");
        }
        System.out.println();
    }
}
