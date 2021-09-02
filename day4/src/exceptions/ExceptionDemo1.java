package exceptions;

public class ExceptionDemo1 {

	public static void main(String[] args) {

		try {
			int a = 10;
			int b = 0;
			double result = a / b;

			String[] names = new String[5];
			System.out.println(names.length);
			try {
				int[] nums = { 1, 2, 3 };
				System.out.println(nums[3]);

			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Inner Catch : " + e);
			}
			System.out.println("No Exceptions...");

		} catch (NullPointerException e) {
			System.out.println("Null Pointer Exception Handled :" + e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("Exception Handled :" + e.getMessage());
		}finally {
			System.out.println("Finally executes....");
		}

		System.out.println("Program ran successfully, Bye Bye..");

	}

}
