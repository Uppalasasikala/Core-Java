package loops;

import java.util.Scanner;

public class KaprekarNumber {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		long square = (long) n * n; 
        String squareStr = String.valueOf(square); 
        int length = squareStr.length();
        String leftPart = squareStr.substring(0, length / 2); 
        String rightPart = squareStr.substring(length / 2); 
        int left = Integer.parseInt(leftPart);
        int right = Integer.parseInt(rightPart);
        int sum= left+right;
        if(sum==n) 
        	{
                System.out.println(n + " is a Kaprekar number.");
            } else {
                System.out.println(n + " is not a Kaprekar number.");
            }
        scr.close();

	}

}
