package array;
import java.util.Arrays;

public class Arrayareequalornot {
    public static void main(String[] args) {
        int arr[] = {1,3,2,4,5,6};
        int arr1[] = {4,2,5,3,6,1};

       Arrays.sort(arr);
       Arrays.sort(arr1);

       for(int i=0;i<arr.length;i++){
        if(arr[i]!=arr1[i]){
            System.out.println(false);
        }

       }
       System.out.println(true);
    }
}
