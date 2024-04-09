package array;

import java.util.Arrays;

public class containDuplicate {
    public static boolean containsduplicate(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        boolean ans = containsduplicate(nums);
        System.out.println(ans);
    }
}
