public class App {
    String name;
    int value;
    int size;

    public App(String name, int value, int size) {
        this.name = name;
        this.value = value;
        this.size = size;
    }

    public double valuePerMb() {
        return (double) value / size;
    }

    @Override
    public String toString() {
        return "App{" +
                "name='" + name + '\'' +
                ", value=" + value +
                ", size=" + size +
                '}';
    }
}
