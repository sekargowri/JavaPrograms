package javastring;

public class ReverseStringUsingStringVariable {

	public static void main(String[] args) {

		System.out.println("Reverse String Using String Variable");
		System.out.println("------------------------------------");

		String originalString = "Gowri";
		System.out.println("Original String: " + originalString); // Gowri

		String reverseString = "";

		int lengthOfString = originalString.length();
		System.out.println("Length Of String: " + lengthOfString); // 5

		for (int i = lengthOfString - 1; i >= 0; i--) {
			reverseString = reverseString + originalString.charAt(i);
		}

		System.out.println("Reverse String: " + reverseString); // irwoG

	}

}
