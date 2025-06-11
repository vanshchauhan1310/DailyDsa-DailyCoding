package Dsa.Arrays;

public class Rotateby1 {
    public static void main(String[] args) {
    int [] arr = {1,2,3,4,5,6,7};
    Brute(arr);
    }

    public static void Brute(int[] arr){

        int n = arr.length;
        int [] temp = new int[n];
        int j = 1;
        for(int i = 0;i<n-1;i++){
            temp[i] = arr[j];
            j++;
        }
        temp[n-1]=arr[0];

        for(int i=0;i<n;i++){
        System.out.println(temp[i]);
        }
    }

    static void solve(int arr[], int n) {
     int temp = arr[0]; 
     
     for (int i = 0; i < n - 1; i++) {
       arr[i] = arr[i + 1];
      }

      arr[n - 1] = temp;
       
      for (int i = 0; i < n; i++) {
        System.out.print(arr[i]+" ");
      }
    
    }
}
