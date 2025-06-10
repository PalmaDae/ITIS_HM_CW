import java.io.*;

public class Task1 {
	public static void copyNotepad(String input, String output) throws IOException{
		BufferedReader reader = new BufferedReader(new FileReader(input)); 
		PrintWriter writer = new PrintWriter(new FileWriter(output));
		String line;
		
		while ((line = reader.readLine()) != null) {
			writer.println(line);
		}
	}
	
	public static void main(String[] args) {
		String input = "C:\\Java_Projects\\06.05\\Input\\notepad.txt";
		String output = "C:\\Java_Projects\\06.05\\Output\\secondNotepad.txt";
		
		try {
			copyNotepad(input, output);
		} catch(IOException e) {
			System.out.println("");
		}
	}
}