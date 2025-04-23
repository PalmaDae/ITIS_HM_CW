package Task_5;

public class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String speak() {
        return "Some sound";
    }

    @Override
    public String toString() {
        return "Animal: " +
                "name='" + name + '\'' +
                ", age= " + age;
    }
}
