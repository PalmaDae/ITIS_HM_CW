package Task_5;

public class Cat extends Animal{
    private String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color =  color;
    }

    @Override
    public String speak() {
        return "Meow!";
    }

    @Override
    public String toString() {
        return super.toString() + " color: " + color;   
    }
}
