package Hashing;
import java.util.Scanner;
public class Repinstring {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the strings");
    String a = s.nextLine();


    int hash [] = new int[26];
    for(int i=0;i<a.length();i++){
        char c = a.charAt(i);
        hash[c-'a']++;
    }

    System.out.println("Enter the character:");
    String chara = s.nextLine();
    char ch = chara.charAt(0); 

    System.out.println("character " + ch + " Repeated " + hash[ch-'a'] + " times");
    s.close();
}
}
