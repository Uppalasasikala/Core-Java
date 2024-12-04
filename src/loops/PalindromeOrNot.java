package loops;

import java.util.Scanner;

public class PalindromeOrNot {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		int n= scr.nextInt();
		int rem=0;
		int rev=0;
		int temp=n;
		for(;n>0; )
		{
			rem=n%10;
			rev=rev*10 + rem;
			n=n/10;
		}
		if(temp == rev)
			System.out.println(temp+" "+"palindome number");
		
		else
			System.out.println(temp+" "+"not palindome number");
		scr.close();
	}
     
}
