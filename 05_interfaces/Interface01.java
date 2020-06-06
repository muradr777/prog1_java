interface Parent {
    public default void doit() {
        System.out.println("DoIt parent");
    }
    public static void doItToo() {
        System.out.println("DoItToo parent");
    }
    
    abstract int doItAlso();
    public void doSomething();
}


class Child implements Parent {
    private int i = 42;
    
    public int doItAlso() {
        System.out.println(i);
        return 1;
    }
    public void doSomething() {
        System.out.println("Testtest");
    }
}

class GrandChild extends Child {
    public void checkit() {
        System.out.println("Got this!");
    }
}

public class Interface01 {
    public static void main(String[] args) {
        GrandChild gr = new GrandChild();
        gr.doItAlso();
    } 
}