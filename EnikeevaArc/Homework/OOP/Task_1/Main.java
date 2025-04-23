package Task_1;

public class Main {
    public static void main(String[] args) {
        Character[] characters = new Character[]{
            new Warrior(120,69),
            new Mage(80, 101)
        };

    for (Character character : characters) {
        character.infoAboutClass();
        character.attack();
        character.simeKingMethod();
        System.out.println();
    }
    }
}
