public class Rational {
    public static void main(String[] args) {
        int[][] array = {
            {4, 6}, // Zähler, Nenner
            {15, 24} // Zähler, Nenner
        }; 

        int ggT0 = ggT(array[0]);
        int ggT1 = ggT(array[1]);

        // Durch ggT teilen
        array[0][0] /= ggT0; // Erste Zahl
        array[0][1] /= ggT0; // Erste Zahl

        array[1][0] /= ggT1; // Zweite Zahl
        array[1][1] /= ggT1; // Zweite Zahl

        print(array);
    }

    public static int ggT(int[] array) {
        int c;
        int a = array[0];
        int b = array[1];
        if(b > a) {
            int tmp = a;
            a = b;
            b = tmp;
        }
        while(a % b != 0) { // Euklidische Alghoritmus
            c = a%b;
            a = b;
            b = c;
        }
        return b;
    }

    public static void print(int[][] array) {
        for(int i=0; i < array.length; ++i) {
            System.out.println(array[i][0] + "/" + array[i][1]);
        }
    }
}