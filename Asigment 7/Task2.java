import java.io.*;

public class Task2 {
	public static void copyPicture(String input, String output) throws IOException{
		FileInputStream fis = new FileInputStream(input);
		FileOutputStream fos = new FileOutputStream(output);
		
		int i;
		
		while ((i = fis.read()) != -1) {
			fos.write(i);
		}
		fis.close();
		fos.close();
	}
	
	public static void main(String[] args) {
		String input = "C:\\Java_Projects\\06.05\\Input\\picture.jpg";
		String output = "C:\\Java_Projects\\06.05\\Output\\picture.jpg";
		
		try {
			copyPicture(input, output);
		}catch(IOException e) {
			System.out.println("");
		}
	}
}