package hackerRank;

import java.util.Scanner;

public class DeleteAllVowelsFromaStringUsingStringBuffer {
	public static String removeVowels(String str) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
           
            if(!isVowel(c))
                sb.append(c);
        }
         return sb.toString();
    }
    public static boolean isVowel(char c) {

        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c=='A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String str = scr.nextLine();
        String result = removeVowels(str);
        System.out.println(result);
        scr.close();
    }
}
