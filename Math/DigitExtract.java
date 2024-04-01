public class DigitExtract {

    public static int Digit(int N) {
        int lastDigit;
        int count = 0;
    
        while (N > 0) {
            lastDigit = N % 10;
            N = N / 10;
            count++;
        }
    
        return count;
    }   
     

    public static void main(String[] args) {
        int ans = Digit(234);
        System.out.println(ans);
    }
}
