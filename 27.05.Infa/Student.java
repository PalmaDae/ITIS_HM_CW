@Author(name="Arthur", year=2007)
public class Student {
	public String name;
	public int age;
	public boolean ready;
	

	
	public Student(String name, int age, boolean ready) {
		this.name = name;
		this.age = age;
		this.ready = ready;
	}
	
	public boolean getReady() {
		return ready;
	}
	
	public String getName() {
		return name;
	}
	
	public String hehe(Student s1) {
		return "hehe";
	}
	
	public int getAge() {
		return age;
	}
}