package array;

public class FindMissingNumber {
 public static void main(String[] args) {
    int[] arr = {1,2,3,5};
    int n = arr.length;
    int sum = 0;
    for(int i=0;i<n-1;i++){
        sum = sum + arr[i];
        }
    
    int result = n*(n+1)/2;

    int ans = result-sum;
    System.out.println(ans);


 }   
}
