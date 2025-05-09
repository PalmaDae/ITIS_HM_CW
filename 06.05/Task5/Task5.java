import java.io.*;
import java.net.*;
import java.util.*;

public class Task5 {
	@SuppressWarnings("deprecation")
	public static void httpFromUrl(String urlByString, String output) throws IOException{
		URL myUrl = new URL(urlByString);
		InputStream is = myUrl.openStream();
		FileOutputStream fos = new FileOutputStream(output); 
		
		int i;
		
		while ((i = is.read()) != -1) {
			fos.write(i);
		}
		fos.close();
		is.close();
	}
	
	public static void picturesInNotepad(String http) throws IOException{
		BufferedReader reader = new BufferedReader(new FileReader(http));
		PrintWriter writer = new PrintWriter(new FileWriter("C:\\Java_Projects\\06.05\\Task5\\Files\\src.txt"));
		
		String line;
		
		while((line = reader.readLine()) != null) {
			line = line.toLowerCase();
			if (line.contains("<img") && line.contains("https") && (line.contains(".jpg") || line.contains(".png"))) {
				
				String[] data = line.split("src=\"");
				for (int i = 1; i < data.length; i++) {
					String src = data[i].split("\"")[0];
					writer.println(src);
				}
			}
		}
		
		writer.close();
		reader.close();
	}
	
	public static void parsePictures(String src) throws IOException{
		String output = "C:\\Java_Projects\\06.05\\Task5\\Images\\picture";
		Scanner scanner = new Scanner(new File(src));
		
		int i = 0;
		
		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			httpFromUrl(line, (output + i + ".jpg"));
			i++;
		}
	}
	
	public static void main(String[] args) {
		String urlByString = "https://kpfu.ru/itis";
		String http = "C:\\Java_Projects\\06.05\\Task5\\Files\\HTTP.txt";
		String src = "C:\\Java_Projects\\06.05\\Task5\\Files\\src.txt";
		
		try {
			httpFromUrl(urlByString, http);
			picturesInNotepad(http);
			parsePictures(src);
		} catch(IOException e) {
			System.out.println("");
		}
	}
}