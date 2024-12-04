package hackerRank;

import java.util.Scanner;

public class PalindromeChecker {
	 public static void main(String[] args) {
	        Scanner scr = new Scanner(System.in);
	        String s1 = scr.nextLine();
	        StringBuffer sb1 = new StringBuffer();
	        StringBuffer sb2 = new StringBuffer();
	        char[] ch = s1.toCharArray();
	        for (int i = 0; i < ch.length; i++) {
	            if (Character.isLetterOrDigit(ch[i])) {
	                sb1.append(ch[i]);
	                sb2.append(ch[i]);
	            }

	        }
	        if (sb1.toString().equalsIgnoreCase(sb2.reverse().toString())) {
	            System.out.println("True");
	        } else {
	            System.out.println("False");
	            scr.close();
	        }

	    }
}