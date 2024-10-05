// this is done with division operator


public class ProductOfArrayExceptSelf {
  public static void main(String[] args) {
    int[] nums = {1,2,3,4};

    int n = nums.length;
    int[] result = new int[n];
    int totalProduct = 1;

    for (int num : nums) {
        totalProduct *= num;
    }
    

    for (int i = 0; i < n; i++) {
        result[i] = totalProduct / nums[i];
    }
    
    for(int i=0;i<n;i++){
        System.out.println(result[i]);
    }
}
}