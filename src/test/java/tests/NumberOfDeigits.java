package tests;

public class NumberOfDeigits {

	public static void main(String[] args) {

		int k = 123456789;
		int count = 0;

		while (k != 0) {

			k = k / 10;
			count++;

		}
		System.out.println(count);

	}

}
