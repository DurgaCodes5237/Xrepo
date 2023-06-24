package tests;

public class ReverseTheWord {

	public static void main(String[] args) {

		String names = "welcome to java";
		String reverse = " ";

		String[] words = names.split(" ");

		for (String one : words) {

			for (int k = one.length() - 1; k >= 0; k--) {

				reverse = reverse + " " + one.charAt(k);

			}

//			StringBuffer sb = new StringBuffer(one);
//			System.out.print(sb.reverse() + " ");

		}
		System.out.println(reverse);

	}

}
