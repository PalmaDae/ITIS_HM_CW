package Task_4;

public class Zoo {
    private Animal[] animals = new Animal[10];
    private int count = 0;

    public void addAnimal(Animal animal) {
        if (count < animals.length) {
            animals[count++] = animal;
        }
    }

    public void makeAllSounds() {
        for (int i = 0; i < count; i++) {
            animals[i].makeSound();
        }
    }

    public void feedAll(String foodType) {
        for (int i = 0; i < count; i++) {
            animals[i].eat(foodType);
        }
    }
}
