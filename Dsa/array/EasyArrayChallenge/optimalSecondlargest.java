

public class optimalSecondlargest {
    public static void main(String[] args) {
        int arr [] = {1,2,4,7,7,5};
        int Largest = arr[0];
        int SecondLargest = -1;

        for(int i = 0;i<arr.length;i++){
            if(arr[i]>Largest){
                SecondLargest = Largest;
                Largest = arr[i];
            }
            else{
                if (arr[i]>SecondLargest && arr[i] != Largest) {
                SecondLargest = arr[i];                   
                }
            }
        }
        System.out.println(" Second largest element is  " + SecondLargest);
    }
}
