public class Bubble {
    public static void main(String[] args) {
        int i = 0,j=0;
        int arr[] = {10, 3, 8, 5, 7, 6};
        System.out.println("Unsorted Array");
        int n = arr.length;
        for(i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println("\nSorted Array");
        for(i=0;i<n-1;i++){
            for(j=0;j<n-i-1;j++){
                if (arr[j]>arr[j+1]) {
                  int temp = arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=temp; 
                }
            }
        }
        for(i=0;i<n;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
