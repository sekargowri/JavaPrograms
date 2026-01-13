package javanumber;

import java.util.Scanner;

public class FindNumberDivisibleBy2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = scanner.nextInt();

		if (number % 2 == 0) {
			System.out.println("Given Number Divisible By 2");
		} else {
			System.out.println("Given Number Not Divisible By 2");
		}

	}

}
