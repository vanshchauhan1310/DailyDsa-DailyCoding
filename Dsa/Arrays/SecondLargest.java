// Given an array of integers nums, return the second-largest element in the array.
// If the second-largest element does not exist, return -1.

// Examples:
// Input: nums = [8, 8, 7, 6, 5]
// Output: 7
// Explanation: The largest value in nums is 8, the second largest is 7


// Input: nums = [10, 10, 10, 10, 10]
// Output: -1
// Explanation: The only value in nums is 10, so there is no second largest value, thus -1 is returned

package Dsa.Arrays;

import java.util.Arrays;
public class SecondLargest {
    
     public static int Bruteforce(int nums[]){
        Arrays.sort(nums);
        int n = nums.length;
        
        for(int i = n-2;i>=0;i--){
             if(nums[i]<nums[n-1]){
                return nums[i];
             }
        }

        return -1;
     }

     public static int Better(int nums[]){
      int largest = nums[0];
      int slargest= Integer.MIN_VALUE;
      int n =  nums.length;

      for(int i=1;i<n;i++){
         if(nums[i]>largest){
            largest= nums[i];
         }
      }

      for(int i=0;i<n;i++){
         if (nums[i] > slargest && nums[i] < largest) {
           slargest=nums[i];
         }
      }


      return slargest;
     }

     public static int Optimal(int nums[]){
      int largest = nums[0];
      int n = nums.length;
      int slargest = Integer.MIN_VALUE;

      for(int i = 1;i<n;i++){
         if (nums[i]>largest) {
            slargest = largest;
            largest = nums[i];
         }
         else if(nums[i]>slargest && nums[i]!=largest){
            slargest=nums[i];
         }

      }

      return slargest;
     }

    public static void main(String[] args) {
        
        int[] nums = {8,8,7,6,5};
        int BruteforceAnswer = Bruteforce(nums);
        System.out.println(BruteforceAnswer);

        System.out.println(Better(nums));
        System.out.println(Optimal(nums));



    }

}
