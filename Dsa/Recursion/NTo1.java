public class NTo1 {

    public static void main(String[] args) {
        int n = 5;
        NTO1(n); 
        System.out.println("\n");
        REVTON(n);
    }

    public static void NTO1(int n) {
        if (n < 1) {
            return; 
        }

        System.out.println(n);

        NTO1(n - 1); 
    }

    public static void REVTON(int n){
        if(n == 0){
            return ;

        }

        REVTON(n-1);
        System.out.println(n);
    }
}