package loops;

//7.Sum of Factorials of Digits in a Number

import java.util.Scanner;

public class SumOfFactorialsOfDigitsInaNumber {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int rem = 0;
        int sum = 0;
        while(n>0) {
            rem = n%10;
            int factorial = 1;
            for(int i=1;i<=rem;i++) {
                factorial=factorial*i;
            }
                sum=sum+factorial;
                 n=n/10;
            }
        System.out.println(sum);
        scr.close();

	}

}
