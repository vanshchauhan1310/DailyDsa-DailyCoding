package BinarySearch;

public class CelingNumber {
    public static void main(String[] args) {
        int [] nums = {9,10,11,12,13};
        int target = 8;
        int res = celing(nums, target);
        System.out.println(res);
    }

    public static int celing(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;
        int result = -1;
    
        while (start <= end) {
            int mid = start + (end - start) / 2;
    
            if (arr[mid] >= target) {
                result = arr[mid];
                end = mid - 1;  
            } else {
                start = mid + 1;
            }
        }
    
        return result;
    }
}
