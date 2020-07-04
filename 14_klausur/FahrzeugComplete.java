/* Fahrzeuge Ausgabe *
 ? Complete program to get this output:
 * Bin Auto 180 km/h und meine Farbe ist rot.
 * Bin Auto 180 km/h und meine Farbe ist blau.
 * Bin Flugzeug 800 km/h und meine Farbe ist weiß.
 * Es wurden insgesamt 3 Objekte erstellt, die die Klasse Fahrzeug als Beispielklasse verwenden.
*/

public class FahrzeugComplete {
    public static void main(String[] args) {
        Fahrzeug[] a = {new Auto("rot"), new Auto("blau"), new Flugzeug("weiß")};

        for(Fahrzeug x : a)
            System.out.println("Bin " + x.whatTyp() + " " + x.geschwindigkeit() + " km/h und meine Farbe ist " + x.farbe() + ".");

        System.out.println("Es wurden insgesamt " + Fahrzeug.getAnzahlFahrzeuge() + " Objekte erstellt, die die Klasse Fahrzeug als Beispielklasse verwenden.");
    }
}

class Fahrzeug {
    String type  = "";
    String color = "";
    int speed;

    static int cntObj = 0;

    Fahrzeug (String color) {
        this.color = color;
        cntObj = cntObj+1;
    }
    // Getters
    String whatTyp() {
        return this.type;
    }
    int geschwindigkeit() {
        return this.speed;
    }
    String farbe() {
        return this.color;
    }
    // Setters
    void setType(String type) {
        this.type = type;
    } 
    void setSpeed(int speed) {
        this.speed = speed;
    } 
    // Static
    static int getAnzahlFahrzeuge() {
        return cntObj;
    }
}

class Auto extends Fahrzeug {
    Auto(String color) {
        super(color);
        super.setType("Auto");
        super.setSpeed(180);
    }
}

class Flugzeug extends Fahrzeug {
    Flugzeug(String color) {
        super(color);
        super.setType("Flugzeug");
        super.setSpeed(800);
    }
}