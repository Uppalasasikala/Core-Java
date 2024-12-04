package loops;

import java.util.Scanner;

public class Pascal {

	public static void main(String[] args) {
         Scanner scr = new Scanner(System.in);
         int n = scr.nextInt();
         for (int i = 0; i < n; i++) {
        	 for (int j = 0; j < n - i - 1; j++) 
	                System.out.print(" ");
        	 int value = 1;
        	 for (int j = 0; j <= i; j++) {
	         System.out.print(value + " ");
        	 value = value * (i - j) / (j + 1);
        	 }
        	 System.out.println();
        	 scr.close();
         
	            
         }


	}

}
