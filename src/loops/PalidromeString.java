package loops;

import java.util.Scanner;

public class PalidromeString {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String original_name = scr.nextLine();
		String reversed_name="";
		String temp = original_name;
		for(int i=0;i<original_name.length();i++) {
		 reversed_name = original_name.charAt(i)+reversed_name;
		
		}
		System.out.println("reversed_name: "+ reversed_name);
		if(reversed_name.equalsIgnoreCase(temp)) {
			System.out.println("it's palindrome String");
		}else {
			System.out.println("it's not palindrome String");
		}
		scr.close();

	}

}
