

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
    
        while (start <= end) {
            int mid = start + (end - start) / 2;
    
            if (target<arr[mid]) {
                end = mid - 1;  
            }else if (target>arr[mid]) {
                start = mid+1;
            } 
            
            else {
               return mid;
            }
        }
    
        return start;
    }
}


// In case of celing number just return the start 
// In case of floor number just return the end