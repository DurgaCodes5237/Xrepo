package tests;

public class FictiorialNumber {

	public static void main(String[] args) {

		int i = 5;
		int factorial = 1;

		for (int k = 1; k <= i; k++) {

			factorial = factorial * k;
		}

		System.out.println(factorial);

	}

}
