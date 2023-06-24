package tests;

public class DuplicateWords {

	public static void main(String[] args) {
		boolean status = false;

		String[] names = { "durga", "prasad", "mahesh", "durga" };

		for (int i = 0; i < names.length; i++) {

			for (int j = i + 1; j < names.length; j++) {

				if (names[i] == names[j]) {
					System.out.println("this is the duplicate word  :" + names[i]);
					status = true;
				}

			}
		}

		if (status == false) {
			System.out.println("no duplicates");
		}

	}
}