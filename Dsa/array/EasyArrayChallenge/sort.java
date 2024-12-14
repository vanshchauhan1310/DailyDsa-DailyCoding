import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class sort {

    

    public static void main(String[] args) {
        int[] arr = {50, 22, 84, 21, 93};

        // Arrays.sort(arr);

        // // for(int i= 0;i<arr.length;i++){
        // //     System.out.println(arr[i]);
        // // }


        ArrayList <Integer> list = new ArrayList<Integer>();
        for(int i = 0;i<arr.length;i++){
            list.add(arr[i]);
        }

        System.out.println(list);

     
        Collections.sort(list,(a,b)-> a%10-b%10);
        System.out.println(list);

        // // Collections.reverse(list);
        // // System.out.println(list);

        // ArrayList <Integer> list2 = new ArrayList<>();
        // list2.add(50);
        // list2.add(22);
        // list2.add(39);



        // list.addAll(list2);

        // System.out.println(list);






    }
}
