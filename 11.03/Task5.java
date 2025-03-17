import java.util.Scanner;

public class Task5 {
	public static boolean isDigit(char c) {
		// char c = text.charAt(0);
		
		if (c >= '0' && c <= '9') {
			return true;
		}
		
		return false;
	}
	
	public static boolean isBukva(char c) {
		// char c = text.charAt(0);
		
		if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
			return true;
		}
		
		return false;
	}
	
	public static boolean checkOnVariable(String text) {
		char c = text.charAt(0);
		
		if (c != '_' && !isBukva(c)){
			return false;
		}
		
		for (int i = 1; i < text.length(); i++) {
			c = text.charAt(i);
			if (c != '_' && !isBukva(c) && !isDigit(c)) {
				return false;
			}
		}
		
		if (text == null || text.isEmpty()) {
			return false;
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		String agas = "agas";
		
		String ainur = "123bem";
		
		String azamat = "bimbom123";
		
		String bimBom = "_bimbom";
		
		System.out.println(checkOnVariable(agas));
		System.out.println(checkOnVariable(ainur));
		System.out.println(checkOnVariable(azamat));
		System.out.println(checkOnVariable(bimBom));
	}
}