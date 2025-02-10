public class BinarySearch {

    public static void main(String[] args) {
        int arr [] = {1,2,4,5,8,9};
        int target = 8;
        int result = search(arr, target, 0, arr.length-1); 
        System.out.println(result);
    }

    
    public static int search(int arr [],int target,int s,int e){
        if(s>e){
            return -1;
        }
        
        int mid=(s+e)/2;

        if(arr[mid] == target){
            return mid;
        }

        if (arr[mid]<target) {
            return search(arr, target, s, mid-1);            
        }
        else{
            return search(arr, target, mid+1, e);
        }


    }
}
