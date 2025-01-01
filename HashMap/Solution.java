package HashMap;

public class Solution {
    public int longestSubarray(int[] arr, int k) {
     HashMap<Integer, Integer> sumMap = new HashMap<>();
        int maxLength = 0;
        int cumulativeSum = 0;

        for (int i = 0; i < arr.length; i++) {
            cumulativeSum += arr[i];

            if (cumulativeSum == k) {
                maxLength = i + 1; 
            }

            if (sumMap.containsKey(cumulativeSum - k)) {
                maxLength = Math.max(maxLength, i - sumMap.get(cumulativeSum - k));
            }

            if (!sumMap.containsKey(cumulativeSum)) {
                sumMap.put(cumulativeSum, i);
            }
        }

        return maxLength;

    }
} 