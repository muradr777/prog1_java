class X implements A,B,C {
    public String small() {
        return "klein x";
    }
    public String big() {
        return "groß X";
    }
}
class Y implements A,B,C {
    public String small() {
        return "klein y";
    }
    public String big() {
        return "groß Y";
    }
}

interface A extends Root {}
interface B extends Root {}
interface C extends Root {}

interface Root {
    public default String small() {return null;}
    public default String big() {return null;}
}

public class InterfacesSmallBig {
    public static void testA(A a) {
        System.out.println(a.small());
    }
    public static void testB(B b) {
        System.out.println(b.big());
    }
    public static void testC(C c) {
        System.out.println(c.small());
    }

    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        testA(x);
        testB(x);
        testB(y);
        testC(y);
    }
}