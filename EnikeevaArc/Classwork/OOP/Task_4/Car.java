package Task_4;

public class Car implements Vehicle{
    private int speed;
    private boolean isRunning;

    @Override
    public void start() {
        isRunning = true;
        System.out.println("Машинка едет");
    }

    @Override
    public void stop() {
        isRunning = false;
        System.out.println("Машинка не едет");
    }

    @Override
    public void speedUp(int increment) {
        if (isRunning) {
            speed += increment;
            System.out.println("Скорость увеличена до: " + speed);
        } else {
            System.out.println("Машина не едет, заведи её, брат");
        }
    }
}
