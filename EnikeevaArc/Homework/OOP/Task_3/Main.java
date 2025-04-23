package Task_3;

public class Main {
    public static void main(String[] args) {
        RationalFraction fraction1 = new RationalFraction(4, 8);
        RationalFraction fraction2 = new RationalFraction(1, 2);

        System.out.println(fraction1);
        System.out.println(fraction2);

        System.out.println(fraction1.value());

        fraction1.add2(fraction2);
        System.out.println(fraction1);

        fraction1.sub2(fraction2);
        System.out.println(fraction1);

        RationalFraction result = fraction1.add(fraction2);
        System.out.println(result);

        result = fraction1.sub(fraction2);
        System.out.println(result);

        result = fraction1.mult(fraction2);
        System.out.println(result);

        result = fraction1.div(fraction2);
        System.out.println(result);

        System.out.println(fraction1.equals(fraction2));

        System.out.println(fraction1.numberPart());
    }
}