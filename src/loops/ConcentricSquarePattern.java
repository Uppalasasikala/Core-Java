package loops;

import java.util.Scanner;

public class ConcentricSquarePattern {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		int row = 2*n-1;
		for(int i=0;i<row;i++) {
			for(int j=0;j<row;j++) {
				int val = Math.max(Math.abs(i-(n-1)), Math.abs(j-(n-1)))+1;
				System.out.print(val +" ");
			}
			System.out.println("");
			scr.close();
		}

	}

}
