package hackerRank;

import java.util.Scanner;

public class CollatzSequence {
	public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        while (n != 1) {
            System.out.print(n + " ");
            if (n % 2 == 0) {
                n = n / 2;
                } else {
                n = 3 * n + 1; 
            }
        }
         System.out.println(n);
        scr.close();
        
    }
}
