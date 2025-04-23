package Task_5;

public class Dog extends Animal{
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public String speak() {
        return "Woof!";
    }

    @Override
    public String toString() {
        return super.toString() + " Breed : " + breed;
    }

}
