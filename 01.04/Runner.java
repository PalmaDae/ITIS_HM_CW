import java.util.*;
import java.io.*;

public class Runner {
	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<>();
		Comparator<Integer> myFirstComparator = new MyIntegerComparator();
		
		for (int i = 15; i > 0; i--) {
			array.add(i);
		}
		
		System.out.println(array);
		
		System.out.println("---");
		
		Collections.sort(array, myFirstComparator);
		
		System.out.println(array);
		
		System.out.println("---");
		
		ArrayList<Double> array2 = new ArrayList<>();
		Comparator<Double> mySecondComparator = new MyDoubleComparator(MyDoubleComparator.torch);
		
		for (Double i = 5.0; i > 0; i -= 0.5) {
			array2.add(i);
		}
		
		System.out.println(array2);
		
		System.out.println("---");
		
		Collections.sort(array2, mySecondComparator);
		
		System.out.println(array2);
		
		System.out.println("---");
		
		Comparator<Student> myFourthComparator = new MyAverageScoreComparator();
		
		ArrayList<Student> array5 = new ArrayList<>();
		
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Java_Projects\\01.04\\ListOfStudents.txt"))) {
            String line;
            
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("#");
                String lastName = parts[0];
                String firstName = parts[1];
                String city = parts[2];
                int year = Integer.parseInt(parts[3]);
                int matAnal = Integer.parseInt(parts[4]);
                int diskra = Integer.parseInt(parts[5]);
                int alGem = Integer.parseInt(parts[6]);
                int infa = Integer.parseInt(parts[7]);

                Student student = new Student(lastName, firstName, city, year, matAnal, diskra, alGem, infa);
                array5.add(student);
            }
        } catch (IOException e) {
            System.out.println("");
        }
		
		Collections.sort(array5, myFourthComparator);
		
		for (Student student : array5) {
			System.out.println(student);
		}
	}
}