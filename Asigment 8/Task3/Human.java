public class Human extends Thread{
    private BonusCard bonusCard;
    private String who;
    public Human(BonusCard bc, String who) {
        this.bonusCard = bc;
         this.who = who;
    }

    public void shoppingWithBonuses(int bonuses) {
        synchronized (bonusCard) {
            if (bonusCard.getBonuses() >= bonuses) {
                System.out.println(who + " is gonna buy something.");

            } else {
                System.out.println("Sorry, Honey, no money");
            }
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            shoppingWithBonuses(7);
        }
    }
}
