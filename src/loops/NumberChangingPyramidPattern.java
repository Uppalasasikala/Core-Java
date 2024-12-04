package loops;

//10.Number-changing Pyramid Pattern

import java.util.Scanner;

public class NumberChangingPyramidPattern {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		int num = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(num + " ");
				num++;
			}

			System.out.println();
			scr.close();

		}

	}

}
