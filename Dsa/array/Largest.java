

public class Largest {
    public static void main(String[] args) {
    int arr [] = {1,2,4,3,1,4,5,6,6};
    
    int Largest = arr[0];
    for(int i =0;i<arr.length;i++){
        if(arr[i]>Largest){
            Largest = arr[i];
        }
    }
    System.out.println(" Largest Element in the array is " + Largest);
  }
}
