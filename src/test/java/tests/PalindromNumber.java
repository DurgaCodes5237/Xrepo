package tests;

public class PalindromNumber {

	public static void main(String[] args) {

		int k = 12421;
		int Original_value = k;
		int rev = 0;

		while (k != 0) {

			rev = rev * 10 + k % 10;
			k = k / 10;

		}

		if (Original_value == rev) {
			System.out.println("this is palindrom Number");
		} else {
			System.out.println("this is not a  palindrom Number");
		}

	}

}
