package loops;

 // print even numbers using while loop
import java.util.Scanner;

public class EvenNumberinGivenSetOfNumbers {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int n=scr.nextInt();
		int i=1;
		while(i<=n) {
			if(i%2==0) {
				System.out.println(i);
			}
			i++;
			scr.close();
		}
	}

}
