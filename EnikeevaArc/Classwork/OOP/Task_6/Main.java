package Task_6;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[2];

        students[0] = new Student(5, "11-404", "Васьков", "Вася");


        students[1] = new Aspirant(4, "11-404", "Kotkov", "Kot", "Разбор Демидовича");


        for (Student student : students) {
            System.out.println(student.toString());
            System.out.println(student.getScholarship());
            System.out.println();
        }
    }
}
