
public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,9,4,7,7};
        int Slargest = arr[0];
        int Largest = arr[0];
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>Largest){
                Largest = arr[i];
            }
        }
        int n = arr.length;
        for(int i = 0;i<n;i++){
            if(arr[i]>Slargest && arr[i]!=Largest){
                Slargest = arr[i];
            }
        }

        System.out.println("Second Largest is "+Slargest);
    }
}
