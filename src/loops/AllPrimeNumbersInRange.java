package loops;

//6.Given two integers L and R, print all prime numbers between L and R

import java.util.Scanner;

public class AllPrimeNumbersInRange {
public static boolean isPrime(int n) {
		
		if (n == 1 || n == 2 || n == 3)
			return true ;	
		if (n % 2 == 0||n%3==0)
			return false;
		int i = 0;
		int a = n / 2;
		for (i = 5; i <=a; i += 6)
			if (n % i == 0 || n%(i+2) == 0)
				return false;

		return true;

	}

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		for(int i=scr.nextInt();i<=n;i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
			scr.close();
		}

	}

}
