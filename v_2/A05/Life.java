import java.util.Random;

public class Life {
    public static void main(String[] args) {
        int len = 5;
        boolean [][] array  = new boolean[len][len];

        randFill(array);

        for(int y = 0; y < len; ++y) {
            for(int x = 0; x < len; ++x) {
                for(int i = (y>0?y-1:y); i <= (y<len-1?y+1:y); ++i) {
                    for(int k = (x>0?x-1:x); k <= (x<len-1?x+1:x); ++k) {
                        if(i != y && k != x && array[i][k])
                            System.out.println("ishleyir.");
                    }
                }
            }
        }

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