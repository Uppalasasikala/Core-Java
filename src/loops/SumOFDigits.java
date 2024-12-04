package loops;

import java.util.Scanner;

//Write a program to calculate the sum of digits of a given number using a do-while loop

public class SumOFDigits {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.print("Sum of digits of ");
		int n = scr.nextInt();
		int rem=0;
		int sum=0;
		do{
			rem=n%10;
			sum+=rem;
			n/=10;
		}  while(n>0);
		 System.out.println(sum);
		 scr.close();
	  }


}


