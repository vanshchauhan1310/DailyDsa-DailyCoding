package LinearSearch;

import java.util.Arrays;

public class Searchin2Darray {

    public static void main(String[] args) {
        int [][] nums = {
            {34,22,45},
            {11,43,25},
            {89,78,47}
        };

        int target = 43;

        int [] ans = search(nums, target);
        System.out.println(Arrays.toString(ans));
    }
    

    public static int [] search(int [][] arr,int target){
        for(int row = 0; row<arr.length; row++){
            for(int col = 0; col<arr[row].length; col++){
                if (arr[row][col]==target) {
                    return new int[]{row,col};   
                }
            }
        }
        return new int[]{-1,-1};
    }
}
