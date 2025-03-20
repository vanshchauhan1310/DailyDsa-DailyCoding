public class ton {

    public static void main(String[] args) {
    int i = 1;
        int n = 5;
        TOn(i,n); 
    
    }

    public static void TOn(int i, int n) {
        if(i>n){
            return;
        }

        System.out.println(i);
        TOn(i+1,n);

    }

    
}
