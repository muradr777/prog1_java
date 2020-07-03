class A {
    int i, k;
    static int j = 0;
    A(int i) {
        this.i = i; // 1r) i = 0
        k=++j; // 1r) k = 1
    }
    public void doit() {
        System.out.println(k + " : " + i);
    }
}

class B extends A {
    static int j=0;
    B() {
        super(j++);
    }
    public void doit() {
        System.out.println(j);
    }
}

class C extends B {
    float f; // 2r) f = 23
    C(int i) {
        f = i;
    }
    public void doit() {
        System.out.println(k + " : " + f);
        super.doit();
    }
}

public class Aufgabe03 {
    static void test( A [] a ) {
        for( A x: a )
            x.doit();
    }
    public static void main(String[] args){
        A[] a = {new B(), new C(23), new B(), new C(33)};
        test(a);
    }
}

// * Output
// 1 Objekt -> 1
// 2 Objekt 
// -> 1 : 23.0
// -> 1
// 3 Objekt -> 1
// 4 Objekt
// -> 1 : 33.0
