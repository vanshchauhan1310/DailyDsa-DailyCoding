package array;

import java.util.HashSet;

public class unionofarray {
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        int[] b = {1,2,3,4,5,6,7,8,9,10,11,12};

        int n = a.length;
        int m = b.length;   
 

        HashSet<Integer> s=new HashSet<>();
        	    
        for(int i = 0;i<n;i++)
          s.add(a[i]);
           
        for(int i = 0;i<m;i++)
           s.add(b[i]);
           
         System.out.println(s.size());

         System.out.println(s);
           
 
 
    }
}
