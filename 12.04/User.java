public class User {
	private String name;
	private String score;
	
	public User(String name, String score) {
		this.name = name;
		this.score = score;
	}
	
	@Override
	public String toString() {
		String result = score + " " + name;
		
		return result;
	}
	
	public String getName() {
		return name;
	}
	
	public String getScore() {
		return score;
	}
}