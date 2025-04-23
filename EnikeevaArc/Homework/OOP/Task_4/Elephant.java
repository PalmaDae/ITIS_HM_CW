package Task_4;

public class Elephant implements Animal{
    @Override
    public void makeSound() {
        System.out.println("ТРЮЮЮЮЮЮЮЮЮЮ");
    }

    @Override
    public void eat(String foodType) {
        System.out.println("Слон ест " + foodType);
    }

    public void playWater() {
        System.out.println("Слон играет с водой");
    }
}
