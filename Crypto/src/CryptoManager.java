/*
 * Class: CMSC203 
 * Instructor:
 * Description:Write a Java program to encrypt and decrypt a phrase using two similar approaches, each insecure by modern standards.  
 * Due: MM/DD/YYYY
 * Platform/compiler: ecloise
 * I pledge that I have completed the programming  assignment independently. 
*  I have not copied the code from a student or any source. 
*  I have not given my code to any student.
*  Print your Name here: Dagmawi Kebede
*/
public class CryptoManager {
	
	private static final char LOWER_BOUND = ' ';
	private static final char UPPER_BOUND = '_';
	private static final int RANGE = UPPER_BOUND - LOWER_BOUND + 1;

	
	public static boolean stringInBounds (String plainText) {
		int size = plainText.length();
		for (int i = 0; i < size; i++) {
			if (plainText.charAt(i) < LOWER_BOUND || plainText.charAt(i) > UPPER_BOUND) {
				return false;
			}
		}
		return true;
	}

	public static String encryptCaesar(String plainText, int key) {

		String encrypted = "";
		key%=RANGE;
		int size = plainText.length();
		for (int i = 0; i < size; i++) {
			int c = (int)plainText.charAt(i) + key;
			while(c > UPPER_BOUND) {
				c-=RANGE;
			}
			encrypted+=(char)c;
		}
		return encrypted;
	}
	
	
	public static String encryptBellaso(String plainText, String bellasoStr) {
		
		String encrypted = "";
		int size = plainText.length();
		
		for (int i = 0; i < size; i++) {
			int j = i % bellasoStr.length();
			int c = plainText.charAt(i) + bellasoStr.charAt(j);
			
			while (c > UPPER_BOUND) {
				c-=RANGE;
			}
			encrypted+=(char)c;
		}
		return encrypted;
	}
	
	
	public static String decryptCaesar(String encryptedText, int key) {
		String decrypted = "";
		key%=RANGE;
		int size = encryptedText.length();
		for (int i = 0; i < size; i++) {
			int c = (char)(encryptedText.charAt(i) - key);
			while (c < LOWER_BOUND) {
				c+=RANGE;
			}
			decrypted+=(char)c;
		}
		return decrypted;
	}
	
	
	public static String decryptBellaso(String encryptedText, String bellasoStr) {
		String decrypted = "";
		int size = encryptedText.length();
		
		for (int i = 0; i < size; i++) {
			int j = i % bellasoStr.length();
			int c = encryptedText.charAt(i) - bellasoStr.charAt(j);
			
			while (c < LOWER_BOUND) {
				c+=RANGE;
			}
			decrypted+=(char)c;
		}
		return decrypted;
	}
}
