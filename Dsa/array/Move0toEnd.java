
public class Move0toEnd {

    public static void main(String[] args) {
        int arr[] = {1,2,4,0,3,6,0,0,8,7};
        int temp[] = new int[arr.length];
        int n = arr.length;
        int x = 0; 

        
        for(int i = 0;i<n;i++){
            if(arr[i]!=0){
                x++;
            }
        }

        int j = 0;
        for(int i = 0;i<n;i++){
            if(arr[i]!=0){
                temp[j] = arr[i];
                j++;
            }
        }


        for(int i=0;i<x;i++){
            arr[i]=temp[i];
        }


        for(int i =x;i<n;i++){
            arr[i]=0;
        }


        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }

}