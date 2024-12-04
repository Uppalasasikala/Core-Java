package loops;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		int n=scr.nextInt();
		int sum=0;
		int temp=n;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) 
			sum = sum+i;
		}
		  if(sum==temp)
			System.out.print(temp +" "+"is a perfect number");
		  else 
		    System.out.print(temp +" "+"is not a perfect number");
		  scr.close();

	}

}
