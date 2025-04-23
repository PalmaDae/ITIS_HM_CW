package Task_1;

public class Mage extends Character {
    private int mana;

    public Mage(int healthPoints, Classes class_, int mana) {
        super(healthPoints, class_);
        this.mana = mana;
    }

    public Mage(int healthPoints, int mana) {
        this(healthPoints, Classes.MAGE, mana);
    }

    @Override
    public void infoAboutClass() { // Исправил название метода
        System.out.println("Маг*ੈ✩‧₊˚ Здоровье: " + healthPoints + " Мана: " + mana);
    }

    @Override
    public void simeKingMethod() {
        System.out.println("Маг использует своё заклинание. Остаток маны: " + mana);
    }

    public void counterSpell() {
        System.out.println("Маг отражает атаку противника своим заклинанием");
    }
}
