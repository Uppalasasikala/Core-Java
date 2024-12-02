package conditionalStmts;

import java.util.Scanner;

public class DayNumberAndDayName {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		 System.out.print("Enter a day number (1-7): ");
	     int dayNumber = scr.nextInt();
	     String dayName;
	        switch (dayNumber) {
	            case 1:
	                dayName = "Monday";
	                break;
	            case 2:
	                dayName = "Tuesday";
	                break;
	            case 3:
	                dayName = "Wednesday";
	                break;
	            case 4:
	                dayName = "Thursday";
	                break;
	            case 5:
	                dayName = "Friday";
	                break;
	            case 6:
	                dayName = "Saturday";
	                break;
	            case 7:
	                dayName = "Sunday";
	                break;
	            default:
	                dayName = "Invalid day number. Please enter a number between 1 and 7.";
	        }
	        System.out.println(dayName);
            scr.close();
	}

}
