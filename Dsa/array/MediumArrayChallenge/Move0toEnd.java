
public class Move0toEnd {

    public static void main(String[] args) {
        int arr[] = {1,2,4,0,3,6,0,0,8,7};
        int nonzero = 0;
    
    for(int i = 0;i<arr.length;i++){
        if(arr[i]!=0){
            arr[nonzero]=arr[i];
            nonzero++;
        }
    }
    
    for(int i = nonzero;i<arr.length;i++){
        arr[i]=0;
    }
        
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

}