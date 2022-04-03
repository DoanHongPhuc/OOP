package Lab01;

import java.util.Scanner;

public class Ex225{
	public static void main(String[] args) {
		System.out.println("Enter your numbers: ");

		Scanner scanner = new Scanner(System.in);
		System.out.println("fisrt Number: ");
		double num1 = Double.parseDouble(scanner.next());
		
		System.out.println("Second Number: ");
		double num2 = Double.parseDouble(scanner.next());

		System.out.println("Sum: " + (num1 + num2));
		System.out.println("Difference: " + (num1 - num2));
		System.out.println("Product: " + (num1 * num2));
		System.out.println("Quotient: " + (int)(num1 / num2));
		System.out.println("Divisor of the division: " + (num1 % num2));

		scanner.close();
		
	}
}