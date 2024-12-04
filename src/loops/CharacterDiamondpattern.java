package loops;

import java.util.Scanner;

public class CharacterDiamondpattern {

	 public static void main(String[] args) {
	        Scanner scr = new Scanner(System.in);
	        System.out.print("Enter an uppercase letter: ");
	        char ch = scr.next().toUpperCase().charAt(0);
	        int n = ch - 'A' + 1; 

	        
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n - i - 1; j++) {
	                System.out.print(" ");
	            }
	            for (int k = 0; k < 2 * i + 1; k++) {
	                if (k == 0 || k == 2 * i) {
	                    System.out.print((char) ('A' + i));
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	        }
	        for (int i = n - 2; i >= 0; i--) {
	            for (int j = 0; j < n - i - 1; j++) {
	                System.out.print(" ");
	            }
	            for (int k = 0; k < 2 * i + 1; k++) {
	                if (k == 0 || k == 2 * i) {
	                    System.out.print((char) ('A' + i));
	                } else {
	                    System.out.print(" ");
	                }
	            }
	            System.out.println();
	            scr.close();
	      }		
	 }
}
