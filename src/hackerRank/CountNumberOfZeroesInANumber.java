package hackerRank;

import java.util.Scanner;

public class CountNumberOfZeroesInANumber {
	 public static int countOfZero(int n){
         String numStr = Integer.toString(n);
         int count =0;
         for (char c : numStr.toCharArray()) {
         if (c == '0') {
             count++;
         }
     }
         return count;
     }
 public static void main(String[] args) {
     Scanner scr = new Scanner(System.in);
     int n = scr.nextInt();
     System.out.println(countOfZero(n));
     scr.close();
     
 }

}
