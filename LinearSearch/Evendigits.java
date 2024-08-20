package LinearSearch;

public class Evendigits {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 52};
        int ans = iseven(arr);
        System.out.println(ans);
    }

    static int iseven(int [] arr){
        int count =0;
        for (int num : arr) {
            if (findnum(num)) {
                count ++;                
            }
        }

        return count;
    }

    static boolean findnum(int num){
        int digits = extractdigit(num);
        if (digits % 2 == 0) {
            return true;            
        }
        return false;
    }

    static int extractdigit(int num){
        int count = 0;
        while (num>0) {
            count ++;
            num = num/10;
        }
        return count;
    }


}