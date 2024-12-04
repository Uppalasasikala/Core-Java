package loops;

//9.Reverse Left Half Pyramid Pattern

import java.util.Scanner;

public class ReverseLeftHalfPyramidPattern {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
		scr.close();

	}

}
