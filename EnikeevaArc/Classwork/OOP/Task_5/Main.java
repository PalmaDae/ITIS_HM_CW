package Task_5;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Dog("0_0", 3, "Башкир");
        animals[1] = new Cat("Муся", 1, "Серый");


        for (Animal animal : animals) {
            System.out.println(animal.toString());
            System.out.println(animal.speak());
            System.out.println();
        }
    }
}
