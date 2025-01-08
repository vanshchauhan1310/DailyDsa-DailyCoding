// Given a string s, find the length of the longest 
// substring
//  without repeating characters.

 

// Example 1:

// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.
// Example 2:

// Input: s = "bbbbb"
// Output: 1
// Explanation: The answer is "b", with the length of 1.


class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> charset = new HashSet<>();
        int left = 0;
        int right = 0;
        int maxlength = 0;

        for(right = 0;right<n;right++){
            if(!charset.contains(s.charAt(right))){
                charset.add(s.charAt(right));
                maxlength = Math.max(maxlength,right-left+1);
            }
            else{
                while(charset.contains(s.charAt(right))){
                    charset.remove(s.charAt(left));
                    left++;
                }
             charset.add(s.charAt(right));

            }
        }

        return maxlength;
    }
}