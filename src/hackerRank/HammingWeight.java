package hackerRank;

import java.util.Scanner;

public class HammingWeight {
	 public static void main(String[] args) {
         Scanner scr = new Scanner(System.in);
           int dec = scr.nextInt();
           int sum =0;
           StringBuilder bin= new StringBuilder();
           while(dec>0){
               int remainder = dec%2;
               bin.append(dec%2);
               dec/=2;
               sum += remainder;
               
           }
           System.out.println(sum);
               scr.close();
       }
}