package array;

public class CountPairWithGivenSum {
    public static void main(String[] args) {
        int arr [] = {1,5,7,1};
        int sum = 6;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j] == sum){
                    count++;
                }
            }
        }
        System.out.println(count);
        
    }
}
