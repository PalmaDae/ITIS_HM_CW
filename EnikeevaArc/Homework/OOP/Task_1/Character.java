package Task_1;

public abstract class Character {
    protected int healthPoints;
    protected Classes class_;

    public Character(int healthPoints, Classes class_) {
        this.healthPoints = healthPoints;
        this.class_ = class_;
    }

    public Character(int healthPoints) {
        this(healthPoints, Classes.WARRIOR);
    }

    public void infoAboutClass() {
        System.out.println("Класс: " + class_ + " Здоровье: " + healthPoints);
    }

    public void attack() {
        System.out.println(class_ + " атакует противника");
    }

    public abstract void simeKingMethod();
}
