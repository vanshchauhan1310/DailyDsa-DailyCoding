// Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

// Example 1:

// Input: nums = [3,2,3]
// Output: [3]
// Example 2:

// Input: nums = [1]
// Output: [1]
// Example 3:

// Input: nums = [1,2]
// Output: [1,2]

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        ArrayList<Integer> result = new ArrayList<>();
        int n = nums.length;
        int threshold = n / 3; 
        
        
        HashSet<Integer> Unique = new HashSet<>();
        
        for(int num : nums){
            Unique.add(num);
        }
        
        
        
        for(int num : Unique){
            
            int count = 0;
            for(int j = 0;j<n;j++){
                if(nums[j]==num){
                    count++;
                }
                
            }
            
            if(count>threshold){
                result.add(num);
            }
        }
        
        Collections.sort(result);
        return result;

    }
}
