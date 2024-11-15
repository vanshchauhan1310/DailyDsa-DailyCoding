// 11. Container With Most Water
// https://leetcode.com/problems/container-with-most-water/

//You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

// Find two lines that together with the x-axis form a container, such that the container contains the most water.

// Return the maximum amount of water a container can store.



public class ContainMaxWater {

    class Solution {
        public int maxArea(int[] height) {
            int left = 0 ;
            int right = height.length-1;
            int maxarea = 0;
    
            while(left<right){
                int currentarea = Math.min(height[left],height[right])*(right-left);
                maxarea = Math.max(currentarea,maxarea);
                if(height[left]<height[right]){
                    left++;
                }
                else{
                    right--;
                }
            }
    
            return maxarea;
        }
    }
    
}
