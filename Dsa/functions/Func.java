package functions;

public class Func {

    public static void main(String[] args) {

        int length = 5;
        int breadth = 10;
        int ans = areaofrectangle(length, breadth);
        System.out.println(ans);
    }

    public static int areaofrectangle(int length, int breadth){
        int area = 2*(length+breadth);
        return area;
    }
}