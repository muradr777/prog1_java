public class Substract {
    public static void main(String[] args) {
        int x = 24, y = 13;
        System.out.println("x-y=" + substract(x, y));
    }

    static int substract(int x, int y) {
        while(y != 0) {
            int borrow = (~x) & y;
            x = x^y;
            y = borrow << 1;
        }
        return x;
    }
}