package Task_3;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);

        circle.draw();

        Shape rectangle = new Rectangle(5,3);

        rectangle.draw();

        Shape triangle = new Triangle(5,3);

        triangle.draw();
    }
}
