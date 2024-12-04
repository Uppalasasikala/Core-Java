package hackerRank;

import java.util.Scanner;

public class RemainderWithoutUsingModulus {
	public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int a = scr.nextInt();
        int b = scr.nextInt();
        System.out.println(a-b*(a/b));
        scr.close();
    }
}
