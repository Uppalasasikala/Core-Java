package loops;

import java.util.Scanner;

//9.Sum of Prime Numbers up to 10

public class SumOfPrimeNumber {
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
		int sum =0;
		for(int i=1;i<=10;i++) {
			if(isPrime(i)) {
				sum += i;
				System.out.println(i);
			}
		}
		
		System.out.println(sum);
		scr.close();
	}

}
