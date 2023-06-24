package tests;

public class OddAndEven {

	public static void main(String[] args) {

		int k = 123456789;
		int odd = 0;
		int even = 0;

		while (k != 0) {
			int rem = k % 10;
			if (rem % 2 == 0) {
				even++;

			} else {
				odd++;

			}
			k = k / 10;

		}
		System.out.println(odd);
		System.out.println(even);

	}

}
