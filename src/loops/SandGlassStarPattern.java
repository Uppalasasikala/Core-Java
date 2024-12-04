package loops;

//3.Sand Glass star pattern

import java.util.Scanner;

public class SandGlassStarPattern {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		int i, j;
		for (i = 1; i <= n; i++) {
			for (j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for(j = n ; j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(i=n;i>=1;i--) {
			for(j=1;j<i;j++) {
				System.out.print(" ");
			}
			
			for(j = n; j>=i;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		

	}

}
