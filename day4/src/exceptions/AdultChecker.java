package exceptions;

import java.util.Scanner;

public class AdultChecker {

	public void validateAdult() {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age:");
		int age = sc.nextInt();
		try {
			if (age >= 18) {
				System.out.println("thank you  that you are an Adult");
			} else {
				throw new RuntimeException("Not an Adult, Not permitted..");
				// System.out.println("You are not and adult");
			}
		} catch (RuntimeException e) {
			// e.printStackTrace();
			System.out.println(e.getMessage());
			throw new ArithmeticException();
		} finally {
			sc.close();
		}
	}

}
