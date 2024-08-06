package array;

public class RotatedArray {

    public static void Reverse(int start,int last,int nums[]){
        while(start < last) {
            int temp = nums[start];
            nums[start] = nums[last];
            nums[last] = temp;
            start++;
            last--;

        }
    }
    public static void main(String[] args) {
        int[] nums = {4,3,2,5,1};
        int k = 4;
        System.out.println("rotated array");

        int start = 0;
        int last = nums.length-1;

        Reverse(start, last, nums);
        Reverse(start,k-1,nums);
        Reverse(k, last, nums);

        for(int i=0;i<nums.length;i++){ 
            System.out.println(nums[i]);
        }
    }
}
