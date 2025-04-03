public class Student {
	private String lastName;
	private String firstName;
	private String city;
	private int year;
	private int matAnalScore;
	private int diskraScore;
	private int alGemScore;
	private int infaScore;
	
	public int getAvarageScore() {
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
}