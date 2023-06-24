package tests;

import java.util.Random;

public class Fibonacci {

	public static void main(String[] args) {

		int[] fib = new int[10];
		fib[0] = 0;
		fib[1] = 1;

		/*
		 * fib[2] = 1; fib[3] = 2; fib[4] = 3; fib[5] = 5; fib[6] = 8; fib[7] = 13;
		 * fib[8] = 21; fib[9] = 34;
		 */

		System.out.print(fib[0] + " " + fib[1] + " ");

		for (int i = 2; i < 10; i++) {

			fib[i] = fib[i - 1] + fib[i - 2];

			System.out.print(fib[i] + " ");
		}

		System.out.println(Math.random());

		Random rn = new Random();
		System.out.println(rn.nextInt(198, 200));;;;;;
	}

}
