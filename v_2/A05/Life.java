import java.util.Random;

public class Life {
    public static void main(String[] args) {
        int len = 5;
        boolean [][] array  = new boolean[len][len];

        randFill(array);
        print(array);
    }

    public static void randFill(boolean[][] array) {
        for(int i = 0; i < array.length; ++i) {
            for(int k = 0; k < array[i].length; ++k) {
                Random rd = new Random();
                array[i][k] = rd.nextBoolean();
            }               
        }
    }

    public static void print(boolean[][] array) {
        for(int i = 0; i < array.length; ++i) {
            for(int k = 0; k < array[i].length; ++k)
                System.out.print((array[i][k] ? "T" : "F") + " ");
            System.out.println();
        }
    }
}