package loops;

//1.Avg Numbers with Even Number

import java.util.Scanner;

public class AvgNumberswithEvenNumber {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int n = scr.nextInt();
		int count =0;
		int [] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scr.nextInt();
			
		}
		double sum =0;
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				count++;
				sum +=arr[i];
				
			}
		}
		double avg = sum/count;
		System.out.println(avg);
		scr.close();

	}

}
