package exceptions;

public class ExceptionDemo2 {

	public static void main(String[] args) {

		AdultChecker ch = new AdultChecker();
		try {
			ch.validateAdult();
		} catch (RuntimeException e) {
			System.out.println("exception received..");
			e.printStackTrace();
		}

	}

}
