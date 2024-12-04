package loops;

//Write a Java program to repeatedly ask for user input until the user enters "exit" using do while//
import java.util.Scanner;

public class ReadInput {
	 public static void main(String[] args) {
	        Scanner scr = new Scanner(System.in);
	        String input;

	        do {
	            System.out.print("Enter word (type 'exit' to quit): ");
	            input = scr.nextLine();
	            if (!input.equalsIgnoreCase("exit")) {
	                System.out.println(input);
	            }
	        } while (!input.equalsIgnoreCase("exit"));

	        System.out.println("Program terminated. Goodbye!");
	        scr.close();
	    }
}


