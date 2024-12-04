package loops;
//2.happy number
import java.util.Scanner;

public class HappyNumber {
	 public static int isSquaresum(int n){
	        int sum=0;
	        int rem=0;
	        while(n>0){
	            rem=n%10;
	            sum += rem*rem;
	            n/=10;
	        }
	        return sum;
	    }

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
        int n = scr.nextInt();
        int res = n;
        while(true){
            res = isSquaresum(res);
            System.out.println(res);
            if(res==1){
                System.out.println("true");
            break;
            }
            else if(res==n){
                System.out.println("false");
            break;
        }
    }
        scr.close();
		

	}

}
