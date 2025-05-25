import java.util.*;
import java.io.*;
import java.util.stream.*;

public class Runner {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		
		list.add(new Student("Arthur", "Nijnekamsk", 56.0));
		
		list.add(new Student("Damir", "Chelny", 86.6));
		
		list.add(new Student("Misha", "Kazan", 100.0));
		
		list.add(new Student("Dinia", "Kazan", 86.5));
		
		list.add(new Student("Timur", "Chelny", 86.3));
		
		list.stream().filter(s -> s.city.equals("Kazan")).map(s -> s.name).collect(Collectors.toList()).forEach(System.out::println);
	
		double result = list.stream().map(s -> s.avrgScore).reduce((s1, s2) -> (s1 > s2) ? s1 : s2).orElse(0.0);
		
		System.out.println(result);
		
		Map<String, Long> myMap = list.stream().collect(Collectors.groupingBy(s -> s.city, Collectors.counting()));
		
		for (Map.Entry<String, Long> entry : myMap.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	
	}
}