package loops;

//4.Calculate a^b without using built-in functions.

import java.util.Scanner;

public class PowerCalculation {

	public static void main(String[] args) {
		 Scanner scr = new Scanner(System.in);
	        int n = scr.nextInt();
	        int x = scr.nextInt();
	        int result =1;
	        for(int i =1;i<=x;i++){
	            result = result*n;         
	        }
	        System.out.println(result);
	        scr.close();
	}

}
