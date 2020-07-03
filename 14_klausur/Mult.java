//Aufgabe 2
public class Mult {
    public static int x_mult_y(int x, int y) {
        return y<0 ? -mult(0, x, -y) : mult(0, x, y);
    }
    
    public static int mult(int sum, int x, int y) {
        return y > 0 ? mult(sum+x, x, y-1) : sum;
    }

    public static void main(String[] args) {
        System.out.println("-3x-4 = " + x_mult_y(-3, -4));
        System.out.println("0x-4 = " + x_mult_y(0, -4));
        System.out.println("3x0 = " + x_mult_y(3, 0));
    }

}