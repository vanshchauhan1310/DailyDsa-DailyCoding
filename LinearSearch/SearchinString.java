package LinearSearch;

import java.util.Arrays;

public class SearchinString {
    public static void main(String[] args) {
        String name = "Vansh";
        char target = 's';

        boolean ans = Search(name,target);
        // System.out.println(ans);

        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toCharArray());
    }


public static boolean Search(String str,char target){
    if (str.length() == 0) {
        return false;     
    }

    for(int i=0;i<str.length();i++){
        if (str.charAt(i)==target) {
            return true;            
        }
    }

    return false;
} 

}