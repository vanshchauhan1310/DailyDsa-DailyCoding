public class printNto1 {
public static void main(String[] args) {
    int ans = Number(10);
    System.out.println(ans);
}
    
public static int Number(int n){

    if (n==1) {
        return 1;
    }
    System.out.println(n);
    return Number(n-1);
}
}