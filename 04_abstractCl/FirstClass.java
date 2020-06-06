abstract class Parent {
    abstract void setName();
    abstract void setVorname();
}

class Child extends Parent { // ! Child isn't abstract and can't override abstract method
    Child() {
        setName();
    }
    abstract void setName() { // ! Abstract method can't have a Body 
        System.out.println("Child NonAbstract");
    }

    void setVorname() {

    }
}

public class FirstClass {
    public static void main(String[] args) {
        Child ch = new Child();
    }
}