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
	
	public static void main(String[] args) {
		String input = "C:\\Java_Projects\\06.05\\Input\\BinarNotepad.txt";
		String output = "C:\\Java_Projects\\06.05\\Output\\BinarNotepad.dat";
		
		try {
			binNotepad(input, output);
		} catch(IOException e) {
			System.out.println("");
		}
	}
}