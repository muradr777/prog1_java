interface Number {
    public void setNumerator(int num);
    public void setDenominator(int num, int den);
    public int getNumerator();
    public int getDenominator();
    public String toString();
}

public class Rational implements Number {
    private int numerator;
    private int denominator;

    Rational(int num, int den) {
        this.numerator = 0;
        this.denominator = 1;
        setNumerator(num);
        setDenominator(num, den);
        toString();
    }

    public void setNumerator(int num) {
        this.numerator = num;
    }

    public void setDenominator(int num, int den) {
        this.denominator = den;

        if(den < 0) {
            this.numerator = -num;
            this.denominator = -den;
        }
        if (den == 0) {
            try {
                throw new NullException("\nException - Durch Null darf man nicht teilen.");
            } catch (NullException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public int getNumerator() {
        return this.numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }

    public String toString() {
        return this.numerator + "/" + this.denominator;
    }

    public boolean isLessThan(Rational other) {
        int numX = getNumerator();
        int denX = getDenominator();
        int numY = other.numerator;
        int denY = other.denominator;

        numX = numX*denY;
        numY = numY*denX;

        return numX < numY ? true : false;
    }
}