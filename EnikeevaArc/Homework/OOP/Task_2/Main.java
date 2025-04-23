package Task_2;

public class Main {
    public static void main(String[] args) {
        Vector2D v1 = new Vector2D(2, 3);
        Vector2D v2 = new Vector2D(4, -1);

        System.out.println(v1.add(v2));
        System.out.println(v1.sub(v2));
        System.out.println(v1.mult(2));
        v1.add2(v2);
        System.out.println(v1);
        v1.sub2(v2);
        System.out.println(v1);
        v1.mult2(3);
        System.out.println(v1);
        System.out.println(v1.length());
        System.out.println(v1.scalarProduct(v2));
        System.out.println(v1.cos(v2));
        System.out.println(v1.equals(v2));
    }
}