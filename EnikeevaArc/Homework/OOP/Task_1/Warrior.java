package Task_1;

public class Warrior extends Character {
    private int power;

    public Warrior(int healthPoints, Classes class_, int power) {
        super(healthPoints, class_);
        this.power = power;
    }

    public Warrior(int healthPoints, int power) {
        this(healthPoints, Classes.WARRIOR, power);
    }

    @Override
    public void infoAboutClass() {
        System.out.println("Воин✠ Здоровье: " + healthPoints + " Сила: " + power);
    }

    @Override
    public void simeKingMethod() {
        System.out.println("Воин бьёт противника со силой: " + power);
    }

    public void defend() {
        System.out.println("Воин использует свой щит и блокирует атаку противника");
    }
}
