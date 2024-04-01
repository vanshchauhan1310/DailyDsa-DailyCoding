public class Fibbonaci{
    public static int fibo(int n){
        if(n==0 || n==1){
            return n;
        }
  

        int temp = fibo(n-1);
        int temp2 = fibo(n-2);
        
        return temp + temp2;

    }
    public static void main(String[] args) {
    int ans = fibo(3);
    System.out.println(ans);        
    }
}