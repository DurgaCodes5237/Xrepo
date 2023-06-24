package tests;

public class PalindromString {

	public static void main(String[] args) {

		String name = "momk";
		String Original_Name = name;
		String rev = "";

		for (int k = name.length() - 1; k >= 0; k--) {

			rev = rev + name.charAt(k);
		}

		if (Original_Name.equalsIgnoreCase(rev)) {
			System.out.println("this is palindrom string");
		} else {
			System.out.println("this is not a  palindrom string");
		}

	}

}
