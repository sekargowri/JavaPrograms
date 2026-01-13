package javastring;

public class ReverseStringUsingArrayVariable {

	public static void main(String[] args) {

		System.out.println("Reverse String Using Array Variable");
		System.out.println("-----------------------------------");

		String[] originalString = { "G", "o", "w", "r", "i" };

		String reverseString = ""; 

		int lengthOfString = originalString.length;
		System.out.println("Length Of String: " + lengthOfString);

		for (int i = lengthOfString - 1; i >= 0; i--) {
			reverseString = reverseString + originalString[i];
		}

		System.out.println("Reverse String: " + reverseString);

	}

}
