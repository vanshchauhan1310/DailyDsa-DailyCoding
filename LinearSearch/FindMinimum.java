package LinearSearch;

public class FindMinimum {
    public static void main(String[] args) {
        int []nums = {4,6,3,7,3,8,9,2};
        int value = Min(nums);
        System.out.println(value); 
    }

    public static int Min(int [] arr){
        int ans = arr[0];
        for(int i =0;i<arr.length;i++){
            if (arr[i]<ans) {
                ans = arr[i];                
            }
        }
        return ans;
    }
    
}
