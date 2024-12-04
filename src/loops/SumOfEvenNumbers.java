package loops;

import java.util.Scanner;

//Sum oF Even Numbers in given numbers using while loop
public class SumOfEvenNumbers {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		int i =1;
		int sum =0;
		while(i<=n) {
			if(i%2==0) {
				System.out.print(i);
				if(i+1<=n)
			    System.out.print(" +"+" ");
				sum=sum+i;
			}
			i++;
		}
		while (i<=n);
		System.out.println( "="+sum);
		scr.close();
		

	}

}
