import java.io.*;

public class Task3 {
	public static void binNotepad(String input, String output) throws IOException{
		BufferedReader reader = new BufferedReader(new FileReader(input));
		FileOutputStream fos = new FileOutputStream(output);
		
		String line;
		
		while((line = reader.readLine()) != null) {
			String[] data = line.split(" ");
			
			for (int i = 0; i < data.length; i++) {
				byte elem = Byte.parseByte(data[i]);
				fos.write(elem);
			}
		}
		fos.close();
	}
	
	// public static void txtNotepad(String input, String output) throws IOException{
		// BufferedReader reader = new BufferedReader(new FileReader(input));
		// FileOutputStream fos = new FileOutputStream(output);
		
		// String line;
		
		// while((line = reader.readLine()) != null) {
			// byte tempElem = Byte.parseByte(line);
			// int elem = Integer.parseInt(line);
			// fos.write(elem);
		// }
		// fos.close();
	// }
	
	public static void main(String[] args) {
		String input = "C:\\Java_Projects\\06.05\\Input\\BinarNotepad.txt";
		String output = "C:\\Java_Projects\\06.05\\Output\\BinarNotepad.dat";
		
		String secondInput = "C:\\Java_Projects\\06.05\\Output\\BinarNotepad.dat";
		String secondOutput = "C:\\Java_Projects\\06.05\\Output\\NonBinarNotepad.txt";
		
		try {
			binNotepad(input, output);
			txtNotepad(secondInput, secondOutput);
		} catch(IOException e) {
			System.out.println("");
		}
	}
}