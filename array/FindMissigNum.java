package array;

public class FindMissigNum {
   public static void main(String args[]){
    int arr[] = {2,3,1,5};
    int n = arr.length;

    for (int i = 0; i < n - 1; i++) {
        for (int j = i; j < n; j++) {
            if (arr[i] > arr[j]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }

    System.out.println("Array has now been sorted");


    for(int i =0;i<n;i++){
        if (arr[i] != i+1) {
            System.out.println(i+1+" is not present in the array");           
        }
    }
}
}
