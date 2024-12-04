package hackerRank;

import java.util.Scanner;

public class DigitalRoot {
	public static int digitalRoot(int n) {
        while (n >= 10) {
          int sum = 0;
            while (n > 0) {
              sum += n % 10;
              n /= 10;
            }
            n = sum;
      }
      return n;
  }

  public static void main(String[] args) {
      Scanner scr = new Scanner(System.in);
      int n =scr.nextInt();
      System.out.println(digitalRoot(n));
      scr.close();
  }
}
