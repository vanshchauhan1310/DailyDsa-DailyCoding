// problem number 349

// Given two integer arrays nums1 and nums2, return an array of their intersection
// Each element in the result must be unique and you may return the result in any order.


public class Intersection {

    public static void main(String[] args) {
        
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        HashSet<Integer>hs = new HashSet();
        HashSet<Integer>ans = new HashSet();

        for(int i = 0;i<n;i++ ){
            hs.add(nums1[i]);
        }
        
        for(int i = 0;i<m;i++){
            if(hs.contains(nums2[i])){
                ans.add(nums2[i]);
            }
        }


        int arr [] = new int [ans.size()];
         int  index = 0;

        for(int item:ans){
            arr[index++] = item;
        }

        return arr;
     }
}