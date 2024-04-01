package Hashing;
import java.util.Scanner;

public class Numberofrepinarr {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int arr [] = {0,1,2,1,3,2,1};
        int[] hash = new int[13]; 

        for(int i =0;i<arr.length;i++){
            hash[arr[i]] ++;
        }
        
        int number = s.nextInt();
        System.out.println("Number " + number + " Repeat : " + hash[number] + " times");
        s.close();
    }
}
