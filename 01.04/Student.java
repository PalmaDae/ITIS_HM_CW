public class Student implements Comparable<Student>{
	private String lastName;
	private String firstName;
	private String city;
	private int year;
	private int matAnalScore;
	private int diskraScore;
	private int alGemScore;
	private int infaScore;
	
	public int getAverageScore() {
        int result = (matAnalScore + diskraScore + alGemScore + infaScore)/4;
        
        return result;
    }
	
    public Student(String lastName, String firstName, String city, int year, int matAnalScore, int diskraScore, int alGemScore, int infaScore) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.city = city;
        this.year = year;
        this.matAnalScore = matAnalScore;
        this.diskraScore = diskraScore;
        this.alGemScore = alGemScore;
        this.infaScore = infaScore;
    }
	
	@Override
    public String toString() {
        return "" + lastName + " " + firstName + " " + city + 
           " " + matAnalScore + " " + diskraScore + 
           " " + alGemScore + " " + infaScore;
    }
	
	@Override
    public int compareTo(Student other) {
        int lastNameCompare = this.lastName.compareTo(other.lastName);
        
        if (lastNameCompare != 0) {
            return lastNameCompare;
        }
        
        return this.firstName.compareTo(other.firstName);
    }
}