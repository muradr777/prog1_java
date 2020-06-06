abstract class Grandparent {
    abstract void doit();
    abstract void doThat();
}

abstract class Parent extends Grandparent {
    abstract void setVorname();
    abstract void setName();
}

abstract class Child extends Parent {
    @Override
    void setVorname() {
        System.out.println("Vorname ist Murad");
    }
    @Override
    void setName() {

    }

}

public class SecondClass {
    public static void main(String[] args) {

    }
}