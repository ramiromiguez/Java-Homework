package randomrecursion;

import java.util.Random;

public class RandomString {
	public static void main(String[] args) {

	    String upperAlphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	    String lowerAlphabet = "abcdefghijklmnopqrstuvwxyz";
	    String numbers = "0123456789";

	    // combines the 3 Strings
	    String alphaNumeric = upperAlphabet + lowerAlphabet + numbers;

	    StringBuilder sb = new StringBuilder();

	    Random random = new Random();

	    int length = 10;

	    for(int i = 0; i < length; i++) {

	      int index = random.nextInt(alphaNumeric.length());

	      char randomChar = alphaNumeric.charAt(index);

	      sb.append(randomChar);
	    }

	    String randomString = sb.toString();
	    System.out.println("Random String is: " + randomString);

	    System.out.println("lower case: "+randomString.toLowerCase());
	    System.out.println("Upper case: "+randomString.toUpperCase());
	    System.out.println("length: "+randomString.length());
	    System.out.println("returns the character at position 1"+randomString.charAt(1));
	    System.out.println("return the hash code: "+randomString.hashCode());
	    
	  }
}
