package Task_3;

public class Triangle extends Shape{
    private double height;
    private double base;

    public Triangle(double height, double base) {
        this.base = base;
        this.height = height;
    }

    public double calculateArea() {
        return 0.5 * height * base;
    }

    public void draw() {
        System.out.println("Высота: " + height + " основание: " + base + " площадь: " + calculateArea());
    }
}
