// Aufgabe 1
public class ArrayAndObjects {

    public static void test(int[][] a, int i) {
        int [] j = {1,2,3,4};
        if(i>1)
            a[i] = (i&2) != 0 ? a[0] : a[1];
        else
            a[i] = j;
    }
    public static void test(int [] a) {
        for(int i = 0; i <a.length; ++i){
            a[i] = a[i]*2;
            System.out.println(a[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[][] a = {null, null, null, null, null};
        for(int i=0;i<a.length;++i)
            test(a, i);
        for(int i=0;i<a.length;++i)
            test(a[i]);
    }
}