public class stringParandlrome {

    public static void main(String[] args) {
        String s = "vansh";
        int ans = string(0, s);
        System.out.println(ans);
    }
    
    public static int string(int i,String s){
        if (i==s.length()) {
            return 1;            
        }
        else if (s.charAt(i)!=s.charAt(s.length()-i-1)) {
             return 0;  
    } 

    return string(i+1, s);
}
}
