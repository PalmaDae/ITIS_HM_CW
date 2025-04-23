package Task_1;

public class Main {
    public static void arrayWork(Profession[] professions) {
        for (Profession profession : professions) {
            System.out.println(profession.work());
        }
    }

    public static void main(String[] args) {
        Profession[] professions = {
                new Doctor(),
                new Teacher()
        };

        arrayWork(professions);
    }
}