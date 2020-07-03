/* Explaination *
* "b" recursively incrementing before it 49
* after that first if condition not working anymore
* and we go in for loop
*/

public class Rec4 {
    static void rec(int a, int b) {
        if(b<a) rec(a++, ++b);

        for(int i = 0; i*i <=b; ++i) // 0x0, 1x1, 2x2, 3x3, 4x4, 5x5 ... 7x7
            if(i*i==b) System.out.println(b); // First value to output is 49

        /*
        * after this we are going back for previous recursion steps
        * it will only work with 7x7, 6x6, 5x5, 4x4, 3x3, 2x2
        * but not with 1, because of ++b. It's almost coming to loop with value of 2 
        */
    }
    public static void main(String[] args) {
        rec(50, 1);
    }
}


/* OUTPUT *
49
36
25
16
9
4
*/
