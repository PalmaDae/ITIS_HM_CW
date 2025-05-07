import java.net.*;
import java.io.*;

public class Task4 {
	@SuppressWarnings("deprecation")
	public static void saveInfo(String urlByString, String output) throws IOException {
		URL myURL = new URL(urlByString);
		FileOutputStream fos = new FileOutputStream(output);
		
		InputStream fis = myURL.openStream();
		
		int i;
		
		while ((i = fis.read()) != -1) {
			fos.write(i);
		}
		fis.close();
		fos.close();
	}
	
	public static void main(String[] args) {
		String url = "https://kpfu.ru/itis";
		String output = "C:\\Java_Projects\\06.05\\Output\\Http.txt";
		
		String secondURL = "https://kpfu.ru//portal/docs/F_239967613/grant_2.0.jpg";
		String secondOutput = "C:\\Java_Projects\\06.05\\Output\\urlPicture.jpg";
		
		try {
			saveInfo(url, output);
			saveInfo(secondURL, secondOutput)
		}catch(IOException e) {
			System.out.println("");
		}
	
	}
}