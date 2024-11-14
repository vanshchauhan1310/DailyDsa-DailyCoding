
public class Besttimetobuyandsell {
    

    public static void main(String[] args) {
    int arr[] = {7,1,3,2,4,6,5};
    
    int maxprofit = 0;
    int minprice = 0;

    for(int i=1;i<arr.length;i++){
        int profit = arr[i]-arr[minprice];
        if(profit>maxprofit){
            maxprofit = profit;
        }
        if(arr[i]<arr[minprice]){
            minprice = i;
        }

    }

    System.out.println(maxprofit);
    }
}
