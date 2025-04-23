package Task_6;

public class Aspirant extends Student{
    private String scientificWork;

    public Aspirant(double averageMark, String group, String lastName, String firstName, String scientificWork) {
        super(averageMark, group, lastName, firstName);
        this.scientificWork = scientificWork;
    }

    @Override
    public double getScholarship() {
        return (averageMark == 5) ? 2500 : 2000;
    }

    @Override
    public String toString() {
        return "Aspirant{" +
                "scientificWork='" + scientificWork + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", group='" + group + '\'' +
                ", averageMark=" + averageMark +
                '}';
    }
}
