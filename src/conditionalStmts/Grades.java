package conditionalStmts;


//Write a program to display the grade 
import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int marks =scr.nextInt();
		String grade;
		if (marks >= 90) {
			grade = "Grade A";
		} else if (marks >= 75) {
			grade = "Grade B";
		} else if (marks >= 50) {
			grade = "Grade C";
		} else {
			grade = "Fail";
		}
		System.out.println("The grade is: " + grade);
		scr.close();

	}

}
