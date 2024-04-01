public class PrintnameNtime {
    public static void main(String[] args) {
    
       name(1,5);
    }

    public static int name(int i ,int n){
     
        if (i>n) {
            return 0;
        }
        System.out.println("Dsa");
         return name(i+1,n);
    }

}
