package tests;

public class StringReverse {

	public static void main(String[] args) {

		String name = "durga prasad katakatla";

		for (int k = name.length() - 1; k >= 0; k--) {

			System.out.println(name.charAt(k));

		}

		StringBuffer st = new StringBuffer(name);
		System.out.println(st.reverse());

	}

}
