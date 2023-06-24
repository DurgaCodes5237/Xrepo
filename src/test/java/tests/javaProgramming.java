package tests;

public class javaProgramming {

	public static void main(String[] args) {

		int k = 44125543;
		int rev = 0;

		while (k != 0) {

			rev = rev * 10 + k % 10;
			k = k / 10;

		}
		System.out.println(rev);

	}
	
	
	

}
