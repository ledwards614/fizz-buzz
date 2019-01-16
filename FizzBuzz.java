package fizzbuzz;

public class FizzBuzz {

	public static String getAnswerFor(int num) {
		if (isDivByThree(num) && isDivByFive(num)) {
			return "FizzBuzz";
		} else if (isDivByThree(num)) {
			return "Fizz";
		} else if (isDivByFive(num)) {
			return "Buzz";
		}

		return "" + num;
	}

	private static boolean isDivByFive(int num) {
		return num % 5 == 0;
	}

	private static boolean isDivByThree(int num) {
		return num % 3 == 0;
	}

}
