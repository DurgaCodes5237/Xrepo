package tests;

public class SumOfNumber {

	public static void main(String[] args) {

		int k = 12345678;
		int sum = 0;

		while (k != 0) {

			sum = sum + k % 10;
			k = k / 10;

		}
		System.out.println(sum);

	}

}
