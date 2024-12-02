package conditionalStmts;

//Write a program to check if a number is even or odd.//

import java.util.Scanner;

public class EvenorOdd {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int a = scr.nextInt();
		if(a%2==0)
			System.out.println("Even Number");
		else
			System.out.println("Odd Number");
		scr.close();

	}

}
