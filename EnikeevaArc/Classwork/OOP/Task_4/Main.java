package Task_4;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car();

        car.start();
        car.speedUp(4);
        car.stop();
        car.speedUp(7);
        car.start();
        car.speedUp(13);
    }
}
