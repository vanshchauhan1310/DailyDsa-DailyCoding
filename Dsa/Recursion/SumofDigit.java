public class SumofDigit {

    public static void main(String[] args) {
        sum(123);
        System.out.println(RecursiveSum(123));
    }
    
    public static void sum(int n){
        int sum = 0;
        while (n>0) {
            int digit = n%10;
            sum = sum + digit;
            n = n/10;
        }
        System.out.println(sum);
    }

    public static int RecursiveSum(int n){
        if(n==0){
            return 0;
        }

        return (n%10) + RecursiveSum(n/10);
    }
}