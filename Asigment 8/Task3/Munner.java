public class Munner {
    public static void main(String[] args) {
        BonusCard bc = new BonusCard(150);
        Human husband = new Human(bc, "James");
        Human wife = new Human(bc, "Mary");
        husband.start();
        wife.start();
    }
}
