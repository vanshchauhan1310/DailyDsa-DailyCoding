public class ReverseNumber {
    
    static int sum = 0;
    public static void main(String[] args) {
        rev(123);
        System.out.println(sum);
    }

    public static void rev(int n){
        if (n==0) {
            return;
        }
    
        int digit = n%10;
        sum = sum*10 + digit;
        rev(n/10);            

    }
}
