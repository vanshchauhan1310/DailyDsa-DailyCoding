public class Insertion {
    public static void main(String[] args) {
        int arr[] = {10,2,3,7,4,1};
        System.out.println("Unsorted Array");
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nsorted Array");
        for(int i = 1;i<n;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
                
            }
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
