package loops;
//1.number to binary
import java.util.Scanner;

public class NumberToBinary {
	public static void main(String[] args) {
	       
        Scanner scr = new Scanner(System.in);
        int dec = scr.nextInt();
    
        StringBuilder bin= new StringBuilder();
        while(dec>0){
            
            bin.append(dec%2);
            dec/=2;
        }
        System.out.println(bin.reverse());
            scr.close();
    }

}
