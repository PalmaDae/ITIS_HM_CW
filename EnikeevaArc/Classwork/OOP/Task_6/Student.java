package Task_6;

public class Student {
    protected String firstName;
    protected String lastName;
    protected String group;
    protected double averageMark;

    public Student(double averageMark, String group, String lastName, String firstName) {
        this.averageMark = averageMark;
        this.group = group;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public double getScholarship() {
        return (averageMark == 5) ? 2000 : 1900;
    }

    @Override
    public String toString() {
        return "Student" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", group='" + group + '\'' +
                ", averageMark=" + averageMark;
    }
}
