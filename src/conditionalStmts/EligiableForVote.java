package conditionalStmts;

import java.util.Scanner;

//Write a program to determine if a person is eligible to vote

public class EligiableForVote {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int age = scr.nextInt();
		if(age>=18)
			System.out.println("Eligiable For vote");
		else
			System.out.println("Not Eligiable For vote");
		scr.close();

	}

}
