package loops;

import java.util.Scanner;

public class FactorialOfGivenNumber {

	public static void main(String[] args) {
			Scanner scr = new Scanner(System.in);
			System.out.print("Enter the value of n: ");
			int n = scr.nextInt();
			int fact=1;
			do
			{
				fact=fact * n;
				System.out.print(n);
				if(n!=1) {
					System.out.print("*");
					}
				n--;
			}while(n>=1);
			System.out.println(" "+"="+" "+ fact);
			scr.close();
		}


}


