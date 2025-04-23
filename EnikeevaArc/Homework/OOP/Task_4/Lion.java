package Task_4;

public class Lion implements Animal{
    @Override
    public void makeSound() {
        System.out.println("РЫЫЫЫЫЫЫЫЫЫЫЫР");;
    }

    @Override
    public void eat(String foodType) {
        System.out.println("Лев есть " + foodType);
    }

    public void hunt() {
        System.out.println("Лев охотится");
    }
}
