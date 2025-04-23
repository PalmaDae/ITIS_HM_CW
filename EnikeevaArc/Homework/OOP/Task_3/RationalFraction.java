package Task_3;

public class RationalFraction {
    private int numerator;
    private int denominator;

    public RationalFraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public RationalFraction() {
        this.numerator = 0;
        this.denominator = 0;
    }

    public int gcd(int numerator, int denominator) {
        while (denominator != 0) {
            int temp = denominator;
            denominator = numerator % denominator;
            numerator = temp;
        }
        return numerator;
    }

    public void reduce() {
        int gcd = gcd(numerator, denominator);

        numerator /= gcd;
        denominator /= gcd;
    }

    public RationalFraction add (RationalFraction fraction) {
        int numerator2 = this.numerator * fraction.denominator + this.denominator * fraction.numerator;
        int denominator2 = this.denominator * fraction.denominator;

        RationalFraction result = new RationalFraction(numerator2, denominator2);
        result.reduce();
        return result;
    }

    public void add2(RationalFraction fraction) {
        this.numerator = this.numerator * fraction.denominator + this.denominator * fraction.numerator;
        this.denominator = this.denominator * fraction.denominator;
        reduce();
    }

    public RationalFraction sub(RationalFraction fraction) {
        int numerator2 = this.numerator * fraction.denominator - this.denominator * fraction.numerator;
        int denominator = this.denominator * fraction.denominator;

        RationalFraction result = new RationalFraction(numerator2, denominator);
        result.reduce();

        return result;
    }

    public void sub2(RationalFraction fraction) {
        this.numerator = this.numerator * fraction.denominator - this.denominator * this.numerator;
        this.denominator = this.denominator * fraction.denominator;
        reduce();
    }

    public RationalFraction mult(RationalFraction fraction) {
        int numerator2 = this.numerator * fraction.numerator;
        int denominator2 = this.denominator * fraction.denominator;

        RationalFraction result = new RationalFraction(numerator2, denominator2);
        result.reduce();
        return result;
    }

    public void mult2(RationalFraction fraction) {
        this.numerator *= fraction.numerator;
        this.denominator *= fraction.denominator;
        reduce();
    }

    public RationalFraction div(RationalFraction fraction) {
        int numerator2 = this.numerator * fraction.denominator;
        int denominator2 = this.denominator * fraction.numerator;

        RationalFraction result = new RationalFraction(numerator2, denominator2);
        result.reduce();
        return result;
    }

    public void div2(RationalFraction fraction) {
        this.numerator *= fraction.denominator;
        this.denominator *= fraction.numerator;
        reduce();
    }

    public double value() {
        return (double) numerator / denominator;
    }

    public boolean equals(RationalFraction fraction) {
        return this.numerator == fraction.numerator && this.denominator == fraction.denominator;
    }

    public int numberPart() {
        return numerator / denominator;
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}
