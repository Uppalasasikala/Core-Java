package conditionalStmts;

//Write a program to check if a number is positive//

import java.util.Scanner;

public class PostivieNumberOrNot {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int a =scr.nextInt();
		if(a>0) 
			System.out.println("Postivie number");
		else
			System.out.println("Negative number");
		scr.close();

	}

}
