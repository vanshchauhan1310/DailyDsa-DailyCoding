public class ReverseArray2 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        Reverse(arr,0,n);
        for(int i = 0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        } 
       
    }



public static void Reverse(int arr[],int i,int n){
 
if(i>=n/2){
    return;
}
    int temp = arr[i];
    arr[i]=arr[n-i-1];
    arr[n-i-1]=temp;

     Reverse(arr,i+1,n);

}

}
