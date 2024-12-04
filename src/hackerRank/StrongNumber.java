package hackerRank;

import java.util.Scanner;

public class StrongNumber {
	 public static void main(String[] args) {
	       Scanner scr = new Scanner(System.in);
	        int n = scr.nextInt();
	        int rem = 0;
	        int sum = 0;
	        int temp = n;
	        while(n>0) {
	            rem = n%10;
	            int factorial = 1;
	            for(int i=1;i<=rem;i++) {
	                factorial=factorial*i;
	            }
	                sum=sum+factorial;
	                 n=n/10;
	            }
	            if(sum==temp) {
	            System.out.println("true");
	           }else {
	            System.out.println("false");
	            }
	            scr.close();
	    }
}
