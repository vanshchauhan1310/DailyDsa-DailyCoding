public class StringSplit {
    public static void main(String[] args) {
        String str = "i am vansh";
        String output = capital(str);
        System.out.println(output);
    }

    public static String capital(String str) {
        String[] words = str.split(" "); 
        String output = "";

        for (String word : words) {
            if (word.length() > 0) {
                String capitalizedWord = Character.toUpperCase(word.charAt(0)) + word.substring(1);
                output += capitalizedWord + " "; 
            }
        }

        return output; 
    }
}