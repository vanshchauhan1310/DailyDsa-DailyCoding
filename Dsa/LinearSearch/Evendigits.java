package LinearSearch;

public class Evendigits {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 52};
        boolean ans = hasEvenDigits(arr);
        System.out.println(ans);
    }

    static boolean hasEvenDigits(int[] arr){
        for (int num : arr) {
            if (hasEvenDigits(num)) {
                return true;
            }
        }
        return false;
    }

    static boolean hasEvenDigits(int num){
        int digits = extractDigits(num);
        return digits % 2 == 0;
    }

    static int extractDigits(int num){
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}