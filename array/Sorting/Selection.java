public class Selection {
    public static void main(String[] args) {
        int i = 0, j = 0;
        int arr[] = {10, 3, 8, 5, 7, 6};
        System.out.println("Unsorted Array");
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nSorted Array");
        int n = arr.length;
        
        for (i = 0; i <= n - 2; i++) {
            int min = i;
            for (j = i; j <= n - 1; j++) { 
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
