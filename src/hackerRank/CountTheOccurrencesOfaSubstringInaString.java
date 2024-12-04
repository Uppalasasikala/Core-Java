package hackerRank;

import java.util.Scanner;

public class CountTheOccurrencesOfaSubstringInaString {
	public static int countOccurrences(String str, String sub) {
        int count = 0;
        int index = 0;
        while ((index = str.indexOf(sub, index)) != -1) {
             count++;
             index++;
        }
         return count;
     }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String str = scr.nextLine();
        String sub = scr.nextLine();
        int result = countOccurrences(str, sub);
        System.out.println(result);
        scr.close();
    }
}
