//Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

// If target is not found in the array, return [-1, -1].

// You must write an algorithm with O(log n) runtime complexity.

 

// Example 1:

// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]


public class FirstandLastposition {
    public static void main(String[] args) {
        
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] res = {-1,-1};
        int first = findFirst(nums, target);
        int last = findLast(nums, target);
        res[0] = first;
        res[1] = last;
        return res;
     }

        public static int findFirst(int[] nums, int target){
            int left = 0;
            int right = nums.length - 1;
            int ans = -1;
            while(left <= right){
                int mid = left + (right - left) / 2;
                if(nums[mid] == target){
                    ans = mid;
                    right = mid - 1;
                }
                else if(nums[mid] < target){
                        left = mid + 1;
                 }
                else{
                    right = mid - 1;
                    }
                }
                 return ans;
            }

            public static int findLast(int[] nums, int target){
              int left = 0;
              int right = nums.length - 1;
              int ans = -1;
              while(left <= right){
                int mid = left + (right - left) / 2;
                    
                if(nums[mid] == target){
                    ans = mid;
                    left = mid + 1;
                }
                else if(nums[mid] < target){
                     left = mid + 1;
                }
                else{
                    right = mid - 1;
                }
             }
                return ans;
          }
                                                
}
