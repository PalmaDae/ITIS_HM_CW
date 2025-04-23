package Task_4;

public class Monkey implements Animal{
    @Override
    public void makeSound() {
        System.out.println("ААААААААААААААААААААААААААААААА");
    }

    @Override
    public void eat(String foodType) {
        System.out.println("Обезьяна ест " + foodType);
    }

    public void swing() {
        System.out.println("Обезьяна качается на ветвях");
    }
}
