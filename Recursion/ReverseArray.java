// reverse the array using recursion two pointer
public class ReverseArray {
public static void main(String[] args) {
    int arr[] = {1,2,3,4};
    Reverse(arr,0, arr.length-1);
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }

}   

public static void Reverse(int arr[],int l,int r){
    if (l>=r) {
        return ;
    }
    int temp = arr[l];
    arr[l]=arr[r];
    arr[r]=temp;
    Reverse(arr,l+1, r-1);
}

}
