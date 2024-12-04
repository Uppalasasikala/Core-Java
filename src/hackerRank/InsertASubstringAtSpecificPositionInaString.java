package hackerRank;

import java.util.Scanner;

public class InsertASubstringAtSpecificPositionInaString {
	public static String insertSubstring(String str, String sub, int position) {
        StringBuilder sb = new StringBuilder(str);
        sb.insert(position, sub);
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String str = scr.nextLine();
        String sub = scr.nextLine();
        int position =scr.nextInt();
        String result = insertSubstring(str, sub, position);
        System.out.println(result);
        scr.close();
    }
}
