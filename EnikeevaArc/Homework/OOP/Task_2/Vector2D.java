package Task_2;

public class Vector2D {
    private double x;
    private double y;

    public Vector2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Vector2D() {
        this(0, 0);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Vector2D add(Vector2D vector) {
        return new Vector2D(this.x + vector.x, this.y + vector.y);
    }

    public void add2(Vector2D vector) {
        this.x += vector.x;
        this.y += vector.y;
    }

    public Vector2D sub(Vector2D vector) {
        return new Vector2D(this.x - vector.x, this.y - vector.y);
    }

    public void sub2(Vector2D vector) {
        this.x -= vector.x;
        this.y -= vector.y;
    }

    public Vector2D mult(double multiplier) {
        return new Vector2D(this.x * multiplier, this.y * multiplier);
    }

    public void mult2(double multiplier) {
        this.x *= multiplier;
        this.y *= multiplier;
    }

    public double length() {
        return Math.sqrt(x*x + y*y);
    }

    public double scalarProduct(Vector2D vector) {
        return this.x * vector.x + this.y * vector.y;
    }

    public double cos(Vector2D vector) {
        double len1 = length();
        double len2 = vector.length();

        return scalarProduct(vector) / (len1 * len2);
    }

    public boolean equals(Vector2D vector) {
        return this.x == vector.x && this.y == vector.y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
