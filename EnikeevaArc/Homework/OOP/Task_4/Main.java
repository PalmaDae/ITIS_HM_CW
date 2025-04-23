package Task_4;

public class Main {
    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal elephant = new Elephant();
        Animal monkey = new Monkey();

        Zoo zoo = new Zoo();

        zoo.addAnimal(lion);
        zoo.addAnimal(monkey);
        zoo.addAnimal(elephant);

        zoo.makeAllSounds();
        zoo.feedAll("Специальный корм");

        ((Lion) lion).hunt();
        ((Elephant) elephant).playWater();
        ((Monkey) monkey).swing();
    }
}
