package hackerRank;

import java.util.Scanner;

public class SumOfrowsAndColumnsPattern {
	public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int rows =scr.nextInt();
        int columns = scr.nextInt();
        for(int i = 1;i<=rows;i++){
            for(int j = 1;j <= columns;j++){
                System.out.print((i+j)+" ");
            }
            System.out.println();
            scr.close();
        }
    }
}
