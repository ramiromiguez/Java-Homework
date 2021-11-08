package randomrecursion;

import java.util.Random;

public class RandomString {

	static String stringGenerator(String alphaNumeric, int length) {

		StringBuilder sb = new StringBuilder();

		Random random = new Random();

		for (int i = 0; i < length; i++) {

			int index = random.nextInt(alphaNumeric.length());

			char randomChar = alphaNumeric.charAt(index);

			sb.append(randomChar);
		}
		String randomString = sb.toString();
		return randomString;
	}

	public static void main(String[] args) {

		String upperAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String lowerAlphabet = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";

		// combines the 3 Strings
		String alphaNumeric = upperAlphabet + lowerAlphabet + numbers;
		String randomString1 = stringGenerator(alphaNumeric, 10);
		String randomString2 = stringGenerator(alphaNumeric, 10);
		
		System.out.println("Random String 1 is: " + randomString1);

		System.out.println("lower case: " + randomString1.toLowerCase());
		System.out.println("Upper case: " + randomString1.toUpperCase());
		System.out.println("length: " + randomString1.length());
		System.out.println("returns the character at position 0: " + randomString1.charAt(0));
		System.out.println("return the hash code: " + randomString1.hashCode());
		
		System.out.println("Random String 2 is: " + randomString2);

		System.out.println("lower case: " + randomString2.toLowerCase());
		System.out.println("Upper case: " + randomString2.toUpperCase());
		System.out.println("length: " + randomString2.length());
		System.out.println("returns the character at position 0: " + randomString2.charAt(0));
		System.out.println("return the hash code: " + randomString2.hashCode());

	}
}
