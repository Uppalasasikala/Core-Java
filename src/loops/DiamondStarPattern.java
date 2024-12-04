package loops;

import java.util.Scanner;

public class DiamondStarPattern {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		int i, j, k;
		for (i = 1; i <= n; i++) {
			for (j = n; j > i; j--) 
				System.out.print(" ");
			System.out.print("*");
			for (k = 1; k < 2 * (i - 1); k++) 
				System.out.print(" ");
			if (i == 1) 
				System.out.println("");
			else 
				System.out.println("*");
		}

		for (i = n - 1; i >= 1; i--) {
			for (j = n; j > i; j--) 
				System.out.print(" ");
			System.out.print("*");
			for (k = 1; k < 2 * (i - 1); k++) 
				System.out.print(" ");
			if (i == 1)
				System.out.println("");
			else
				System.out.println("*");
		}
	}
}
