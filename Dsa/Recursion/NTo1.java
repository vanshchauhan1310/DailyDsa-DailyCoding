public class NTo1 {

    public static void main(String[] args) {
        int n = 5;
        NTO1(n); 
        System.out.println("\n");
       
    }

    public static void NTO1(int n) {
        if (n < 1) {
            return; 
        }

        System.out.println(n);

        NTO1(n - 1); 
    }


}