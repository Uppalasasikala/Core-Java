package conditionalStmts;

import java.util.Scanner;

public class TriangleValidityCheck {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int a =scr.nextInt();
		int b =scr.nextInt();
		int c =scr.nextInt();
		if(a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a)
			System.out.println("The triangle is a right-angled triangle");
		else
			System.out.println("The triangle is not a right-angled triangle.");
		scr.close();
		

	}

}
