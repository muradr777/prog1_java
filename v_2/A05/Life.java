import java.util.Random;

public class Life {
    public static void main(String[] args) {
        int len = 5;
        boolean [][] array  = new boolean[len][len];
        int [][] array2 = new int[len][len];
        boolean [][] array3  = new boolean[len][len];

        randFill(array);
        print(array);
        for(int y = 0; y < len; ++y) {
            for(int x = 0; x < len; ++x) {
                int counter = 0;
                // Grenzenwerte anpassen, z.B wenn erste Zelle ist, 
                // dann prüfen wir -1 nicht (existiert nicht)
                for(int i = (y>0?y-1:y); i <= (y<len-1?y+1:y); ++i) {
                    for(int k = (x>0?x-1:x); k <= (x<len-1?x+1:x); ++k) {
                        // Denselber Zelle, zählt nicht obwohl true ist
                        if(array[i][k] && !(i==y && k==x))
                            ++counter;
                    }
                }
                array2[y][x] = counter;
                // System.out.println("y:"+y + " x:"+x +" c:"+counter);

                // var. counter zählt wie viele Nachbarn Zelle hat
                // 1. Zelle False und 3 Nachbarn -> wechsel zu True (true == !false)
                // 2. Zelle True, aber mehr als 3 oder weniger als 2 N. -> wechsel zu False (false == !true)
                if(
                    (counter == 3 && !array[y][x]) 
                ||  ((counter < 2 || counter > 3) && array[y][x]) 
                )
                    array3[y][x] = !array[y][x];
                else
                    array3[y][x] = array[y][x];
            }
        }
        System.out.println("===============");
        prInt(array2);
        System.out.println("===============");
        print(array3);
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
    public static void prInt(int[][] array) {
        for(int i = 0; i < array.length; ++i) {
            for(int k = 0; k < array[i].length; ++k)
                System.out.print(array[i][k] + " ");
            System.out.println();
        }
    }
}