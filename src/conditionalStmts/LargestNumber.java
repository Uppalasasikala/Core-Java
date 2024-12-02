package conditionalStmts;

import java.util.Scanner;

//Write a program to find the largest of two numbers using the ternary operator//

public class LargestNumber {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int a =scr.nextInt();
		int b= scr.nextInt();
		int largest = (a > b) ? a : b;
		System.out.println("The largest number is: " + largest);
		scr.close();

	}

}
