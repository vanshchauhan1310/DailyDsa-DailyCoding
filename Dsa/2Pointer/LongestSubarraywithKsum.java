class Solution {
    public int longestSubarray(int[] arr, int k) {
        int n = arr.length;
        int sum = 0;
        int left = 0;
        int maxlength = 0;
        
        for (int right = 0; right < n; right++) {
            sum += arr[right];
            
            while (left <= right && sum > k) {
                sum -= arr[left];
                left++;
            }
            
            if (sum == k) {
                maxlength = Math.max(maxlength, right - left + 1);
            }
        }
        
        return maxlength;
    }
}