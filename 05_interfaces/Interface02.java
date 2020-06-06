interface Grandparents {
    public default void doItEveryday() {
        System.out.print(111);
    }
    public static void doit() {
        System.out.println(123);
    }
    abstract int doitNever();
    public void doSomethingEveryTime();
}

interface Parent {
    public default void doit() {
        System.out.println("Doit");
    }
    public static void doitToo() {
        System.out.println("Too!");
    }
    abstract int doitAlso();
    public void doSomethingToo();
}

class Child implements Grandparents, Parent {
    public int doitNever() {
        System.out.println("Never");
        return 3;
    }
    public void doSomethingEveryTime() {
        System.out.println("EveryTime");
    }
    public int doitAlso() {
        System.out.println("Also");
        return 1;
    }
    public void doSomethingToo() {
        System.out.println("Somethingtoo");
    }
}

public class Interface02 {
    public static void main(String[] args) {
        Child ch = new Child();
        int a = ch.doitAlso();
        System.out.println(a);
    }
}