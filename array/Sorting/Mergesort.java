public class Mergesort {
    
    public static void divide(int arr[], int low, int high) {
        if (low >= high) {
            return;
        }    

        int mid = (low + high) / 2;
        divide(arr, low, mid);
        divide(arr, mid + 1, high);   
        merge(arr, low, mid, high); 
    }

    public static void merge(int arr[], int low, int mid, int high) {
        int temp[] = new int[high - low + 1]; 
        int left = low;
        int right = mid + 1;
        int i = 0;

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[i] = arr[left];
                i++;
                left++;
            } else {
                temp[i] = arr[right];
                i++;
                right++;
            }
        }

        while (left <= mid) {
            temp[i] = arr[left];
            i++;
            left++;
        }

        while (right <= high) {
            temp[i] = arr[right];
            i++;
            right++;
        }

        for (int j = 0; j < temp.length; j++) {
            arr[low + j] = temp[j];
        }
    }

    public static void main(String[] args) {
        int arr[] = {38, 27, 43, 3, 9, 82, 10};
        int length = arr.length;
        
        System.out.println("Original array:");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
        
        divide(arr, 0, length - 1);
        
        System.out.println("\n\nSorted array:");
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}