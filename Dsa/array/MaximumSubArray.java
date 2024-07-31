// problem 53 

// Given an integer array nums, find the 
// subarray
//  with the largest sum, and return its sum.

 

// Example 1:

// Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
// Output: 6
// Explanation: The subarray [4,-1,2,1] has the largest sum 6.
// Example 2:

// Input: nums = [1]
// Output: 1
// Explanation: The subarray [1] has the largest sum 1.


    class Solution {
        public int maxSubArray(int[] nums) {
            // Initialize variables
            int maxSum = nums[0];
            int currentSum = nums[0];
            
            // Start from the second element
            for (int i = 1; i < nums.length; i++) {
                // For each number, we have two choices:
                // 1. Add it to the existing subarray (currentSum + nums[i])
                // 2. Start a new subarray from this number (nums[i])
                // We choose the maximum of these two
                currentSum = Math.max(nums[i], currentSum + nums[i]);
                
                // Update the maximum sum if current sum is larger
                maxSum = Math.max(maxSum, currentSum); 
        }
    
        return maxSum;
    }
    }